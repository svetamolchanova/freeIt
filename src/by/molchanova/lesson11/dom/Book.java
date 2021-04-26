package by.molchanova.lesson11.dom;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Book {
    private String title;
    private String author;
    private String date;
    private String isbn;
    private String publisher;
    private Cost cost;

    public Book() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", date=" + date + ", isbn=" + isbn + ", publisher="
                + publisher + ", cost=" + cost + "]";
    }
}
