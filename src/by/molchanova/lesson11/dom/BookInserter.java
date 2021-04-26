package by.molchanova.lesson11.dom;

import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

public class BookInserter {
	public static void addNewBook(Document document, Book newBook2) {

		Book newBook = new Book();
		newBook.setTitle("new book Title");
		newBook.setAuthor("new book Author");
		newBook.setDate("2018-01-025");
		newBook.setIsbn("0-00-000000-0");
		newBook.setPublisher("new book Publisher");
		Cost bcost = new Cost();
		bcost.setCost(21.1);
		bcost.setCurrency("EUR");
		newBook.setCost(bcost);

		Element book = document.createElement("book-book");

		Element title = document.createElement("Title-title");
		title.setTextContent(newBook.getTitle());

		Element author = document.createElement("Author");
		author.setTextContent(newBook.getAuthor());

		Element date = document.createElement("Date");
		date.setTextContent(newBook.getDate());

		Element isbn = document.createElement("ISBN");
		isbn.setTextContent(newBook.getIsbn());

		Element publisher = document.createElement("Publisher");
		publisher.setTextContent(newBook.getPublisher());
		
		Element cost = document.createElement("Cost");
		cost.setTextContent(String.valueOf(newBook.getCost().getCost()));
		cost.setAttribute("currency", newBook.getCost().getCurrency());

		// Добавляем внутренние элементы книги в элемент <Book>
		book.appendChild(title);
		book.appendChild(author);
		book.appendChild(date);
		book.appendChild(isbn);
		book.appendChild(publisher);
		book.appendChild(cost);

		Node root = document.getDocumentElement();
		// Добавляем книгу в корневой элемент
		root.appendChild(book);

		// Записываем XML в файл
		writeDocument(document);
	}
	
	private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {
        try {
            Transformer tr = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(document);
            FileOutputStream fos = new FileOutputStream("otherBooks.xml");
            StreamResult result = new StreamResult(fos);
            tr.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
