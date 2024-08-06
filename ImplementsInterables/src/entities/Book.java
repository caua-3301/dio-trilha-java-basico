package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Book {
    private String author;
    private String title;
    private LocalDate datePublication;


    public Book(String author, String title, String datePublication) {
        this.author = author;
        this.title = title;
        this.datePublication = LocalDate.parse(datePublication);
    }

    @Override
    public String toString() {
        return "Book \n" +
                "author='" + author + '\'' + "\n" +
                ", title='" + title + '\'' + "\n" +
                ", datePublication=" + datePublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }
}
