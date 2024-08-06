package application;

import controllers.BookControler;
import controllers.PersonController;
import controllers.PersonSetController;
import entities.Book;
import entities.Person;

import java.time.LocalDate;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        /*List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Caua Pires", "A era", "2020-11-08"));
        bookList.add(new Book("Jose Silva", "Gelo", "2021-04-12"));
        bookList.add(new Book("Caetano", "Mar", "1990-03-01"));

        BookControler.showBooks(BookControler.findByAuthor(bookList, "caua pires"));
        BookControler.showBooks(BookControler.findByTitle(bookList, "maR"));
        System.out.println("\n\n\n");
        BookControler.showBooks(BookControler.findByDateInterval(bookList, LocalDate.parse("1800-01-01"), LocalDate.parse("2000-01-01")));
         */

        /*List<Person> personList = new ArrayList<>();

        personList.add(new Person("Caua", 1.68, 19));
        personList.add(new Person("Aldria", 1.55, 76));
        personList.add(new Person("Bianca", 1.62, 28));

        PersonController.orderByAge(personList);
        PersonController.orderByHeight(personList); */

        Set<Person> peoples = new TreeSet<>(Set.of(new Person("Caua", 1.68, 19), new Person("Aldria", 1.55, 76), new Person("Bianca", 1.62, 28)));

        PersonSetController.showSet(peoples);
    }
}
