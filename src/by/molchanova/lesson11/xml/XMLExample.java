package by.molchanova.lesson11.xml;

import by.molchanova.lesson11.dom.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;

public class XMLExample {

    public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException {
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

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        String root = "book";
        Element rootElement = document.createElement(root);
        document.appendChild(rootElement);

        String elementName = "name";
        Element elName = document.createElement(elementName);
        elName.appendChild(document.createTextNode(newBook.getTitle()));
        rootElement.appendChild(elName);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new FileWriter("write_book"));
        transformer.transform(source, result);
    }
}
