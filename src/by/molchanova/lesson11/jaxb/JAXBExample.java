package by.molchanova.lesson11.jaxb;

import by.molchanova.lesson11.dom.*;
import java.io.*;
import javax.xml.bind.*;

public class JAXBExample {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {
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

        workMarshall(newBook);

        workUnMarshall();
    }

    public static void workMarshall (Book book) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller m = context.createMarshaller();
        m.marshal(book, new FileOutputStream("jaxbBook.xml"));
        m.marshal(book, System.out);
        System.out.println("\n***********************");
    }

    public static void workUnMarshall() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Unmarshaller unm = context.createUnmarshaller();
        FileReader reader = new FileReader("jaxbBook.xml");
        Book book = (Book) unm.unmarshal(reader);
        System.out.println(book);
    }
}
