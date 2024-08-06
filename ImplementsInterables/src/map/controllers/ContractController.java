package map.controllers;

import map.entities.Contact;
import map.entities.Product;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class ContractController {
    public static void addInMap(Map<String, String> contacts, Contact contact) {
        contacts.put(contact.getName(), contact.getNumber());

        System.out.println("contact " + contact.getName() + " was added");
    }

    public static void removeInMap(Map<String, String> contacts, String name) {
        contacts.remove(name);

        System.out.println(name + " was removed");
    }

    public static void showInMap (Map<?, ?> contacts) {
        contacts.forEach((key, item) -> {
            System.out.println(contacts.get(key) + " ->  " + key);
        });
    }

    public static void findByName(Map<String, String> contacts, String name) {
        if (contacts.containsKey(name)) {
            System.out.println("the number of " + name + " is " + contacts.get(name));
        }
        else {
            System.out.println("this name dont exist");
        }
    }

    public static void sumAllItens(Map<Integer, Product> productMap) {
        AtomicReference<Double> sum = new AtomicReference<>((double) 0);

        productMap.forEach((key, item) -> {
            sum.updateAndGet(value -> value + item.getPrice());
        });

        System.out.println("the total price is " + sum);

    }

    public static void getMoreExpansive(Map<Integer, Product> productMap) {

    }
}
