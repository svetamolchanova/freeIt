package by.molchanova.lesson11.sax;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;


public class SAXParserExample {
	public static void main(String args[]) {
		 
        final String fileName = "books.xml";
 
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
 
            DefaultHandler handler = new DefaultHandler() {
                boolean title = false;
                boolean date = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("title")) {
                        title = true;
                    }
                    if (qName.equalsIgnoreCase("date")) {
                        date = true;
                    }
                }

                @Override
                public void characters(char ch[], int start, int length) throws SAXException {
                    if (title) {
                        System.out.println("Title: " + new String(ch, start, length));
                        title = false;
                    }
                    if(date) {
                    	System.out.println("Date: " + new String(ch, start, length));
                    	date = false;
                    }
                }
            };


            saxParser.parse(fileName, handler);
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
