package controllers;

import entities.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonController{
    public static void addPerson(List<Person> list, Person person) {
        list.add(person);
    }

    public static void orderByAge(List<Person> list) {
        Collections.sort(list);
        list.forEach(System.out::println);
    }

    public static void orderByHeight(List<Person> list) {
        List<Person> personList = list.stream().sorted(new ComparatorPerson()).toList();
        personList.forEach(System.out::println);
    }

}
