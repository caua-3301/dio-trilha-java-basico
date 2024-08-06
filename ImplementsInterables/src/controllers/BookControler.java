package controllers;

import entities.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class BookControler {
    public static void addBook(List<Book> listBooks, Book book) {
        listBooks.add(book);
        System.out.println("Book added");
    }

    public static List<Book> findByAuthor(List<Book> list, String author) {
        return list.stream().filter(item -> item.getAuthor().equalsIgnoreCase(author)).toList();
    }

    public static List<Book> findByDateInterval(List<Book> list, LocalDate dateStart, LocalDate dateEnd) {
        return list.stream()
                .filter(item -> item.getDatePublication().isAfter(dateStart) && item.getDatePublication().isBefore(dateEnd))
                .toList();
    }

    public static List<Book> findByTitle(List<Book> list, String title) {
        return list.stream().filter(item -> item.getTitle().equalsIgnoreCase(title)).toList();
    }


    public static void showBooks(List<Book> list) {
        list.forEach(System.out::println);
    }
}
