package by.molchanova.lesson11.dom;

import java.io.*;
import javax.xml.bind.*;
import javax.xml.parsers.*;
import javax.xml.stream.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class DOMParserExample {
	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		try {

			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse("books.xml");
			
//			Let's add new book to our XML
			Book newBook = new Book();
			newBook.setTitle("new book Title");
			newBook.setAuthor("new book Author");
			newBook.setDate("2018-01-025");
			newBook.setIsbn("0-00-000000-0");
			newBook.setPublisher("new book Publisher");
			Cost cost = new Cost();
			cost.setCost(21.1);
			cost.setCurrency("EUR");
			newBook.setCost(cost);

			BookInserter.addNewBook(document, newBook);

			Node root = document.getDocumentElement(); //Root element

			System.out.println("List of books:");
			System.out.println();
			
			NodeList books = root.getChildNodes();

			for (int i = 0; i < books.getLength(); i++) {
				Node book = books.item(i);

				if (book.getNodeType() != Node.TEXT_NODE) {

					NodeList bookProps = book.getChildNodes();
					for (int j = 0; j < bookProps.getLength(); j++) {
						
						Node bookProp = bookProps.item(j);
						
						if (bookProp.getNodeType() != Node.TEXT_NODE) {

							System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0).getTextContent());
						}
					}
					System.out.println("\n");
				}
			}

		} catch (ParserConfigurationException ex) {
			ex.printStackTrace(System.out);
		} catch (SAXException ex) {
			ex.printStackTrace(System.out);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
		}

//        XMLInputFactory factory = XMLInputFactory.newFactory();
//        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("book.xml"));
	}
}
