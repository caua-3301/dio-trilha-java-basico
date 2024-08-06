package controllers;

import entities.Person;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonSetController {
    public static void addInSet(Set<String> people, Person person) {
        people.add(person.getName());
    }

    public static void removeInSet(Set<String> people, String name) {
        people.removeIf(item -> item.equals(name));
        System.out.println(name + " was removed");
    }

    public static void countSet (Set<String> people) {
        System.out.println("Have " + people.size() + " in list");
    }

    public static void showSet(Set<? extends Object> people) {
        people.forEach(System.out::println);
    }

    public static void test(Set<Person> people, String name) {
        Set<Person> persons = people.stream().filter(item -> item.getName().equals(name)).collect(Collectors.toSet());

        showSet(persons);
    }
}
