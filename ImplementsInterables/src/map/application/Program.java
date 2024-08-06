package map.application;

import map.controllers.ContractController;
import map.entities.Contact;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();

        ContractController.addInMap(contacts, new Contact("Caua", "1111"));
        ContractController.addInMap(contacts, new Contact("Jose", "2222"));
        ContractController.addInMap(contacts, new Contact("Maria", "3333"));

        ContractController.findByName(contacts, "Jose");

        ContractController.removeInMap(contacts, "Caua");

        ContractController.showInMap(contacts);
    }

}
