package by.molchanova.lesson11.stax;

import java.io.*;
import javax.xml.stream.*;

public class StAXParserExample {
	public static void main(String[] args) {
        try {
        	XMLStreamReader xmlr = XMLInputFactory
                    .newInstance()
                    .createXMLStreamReader("books", new FileInputStream("books.xml"));
        	
            while (xmlr.hasNext()) {
                xmlr.next();
                if (xmlr.isStartElement()) {
                    System.out.println("<" + xmlr.getLocalName() + ">");
                } else if (xmlr.isEndElement()) {
                    System.out.println("</" + xmlr.getLocalName() + ">");
                } else if (xmlr.hasText() && xmlr.getText().trim().length() > 0) {
                    System.out.print("   " + xmlr.getText());
                }
            }
            
        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        }
    }
}
