package by.molchanova.lesson11.xsl;

import java.io.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class XPathExample {
	public static void main(String[] args) {
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse("books.xml");

			//printCost(document);
			//printCost2(document);
			//printCost3(document);
			printCost4(document);

		} catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException ex) {
			ex.printStackTrace(System.out);
		}
	}

	// Печать всех элементов Cost
	private static void printCost(Document document) throws DOMException, XPathExpressionException {
		System.out.println("Example 1 - Печать всех элементов Cost");
		XPathFactory pathFactory = XPathFactory.newInstance();
		XPath xpath = pathFactory.newXPath();

		// Пример записи XPath
		// Подный путь до элемента
		 XPathExpression expr = xpath.compile("books/book/Cost");
		// Все элементы с таким именем
		// XPathExpression expr = xpath.compile("//Cost");
		// Элементы, вложенные в другой элемент
//		XPathExpression expr = xpath.compile("//book/Cost");

		NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
		for (int i = 0; i < nodes.getLength(); i++) {
			Node n = nodes.item(i);
			System.out.println("Value:" + n.getTextContent());
		}
		System.out.println();
	}

	// Печать элемента Cost у которого атрибут currency='USD'
	private static void printCost2(Document document) throws DOMException, XPathExpressionException {
		System.out.println("Example 2 - Печать элемента Cost у которого атрибут currency='USD'");
		XPathFactory pathFactory = XPathFactory.newInstance();
		XPath xpath = pathFactory.newXPath();
		XPathExpression expr = xpath.compile("books/book/Cost[@currency='USD']");
		NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
		for (int i = 0; i < nodes.getLength(); i++) {
			Node n = nodes.item(i);
			System.out.println("Value:" + n.getTextContent());
		}
		System.out.println();
	}

	// Печать элементов Book у которых значение Cost > 4
	private static void printCost3(Document document) throws DOMException, XPathExpressionException {
		System.out.println("Example 3 - Печать элементов Book у которых значение Cost > 15");
		XPathFactory pathFactory = XPathFactory.newInstance();
		XPath xpath = pathFactory.newXPath();
		XPathExpression expr = xpath.compile("books/book[Cost>15]");
		NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
		for (int i = 0; i < nodes.getLength(); i++) {
			Node n = nodes.item(i);
			System.out.println("Value:" + n.getTextContent());
		}
		System.out.println();
	}

	// Печать первого элемента Book
	private static void printCost4(Document document) throws DOMException, XPathExpressionException {
		System.out.println("Example 4 - Печать одного элемента Book");
		XPathFactory pathFactory = XPathFactory.newInstance();
		XPath xpath = pathFactory.newXPath();
		XPathExpression expr = xpath.compile("books/book[3]");
		NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
		for (int i = 0; i < nodes.getLength(); i++) {
			Node n = nodes.item(i);
			System.out.println("Value:" + n.getTextContent());
		}
		System.out.println();
	}

}
