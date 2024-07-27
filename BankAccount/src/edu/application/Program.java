package edu.application;

import edu.model.entities.TerminalAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //initialize scanner
        Scanner scanner = new Scanner(System.in);

        //enter data
        System.out.println("Enter the following data in the order requested: branch, name of holder, account number and balance: ");
        String agency = scanner.nextLine();
        String clientName = scanner.nextLine();
        int accountNumber = scanner.nextInt();
        double balance = scanner.nextDouble();

        //create a new account
        TerminalAccount account = new TerminalAccount(accountNumber, agency, clientName, balance);

        //show to user the data about account
        System.out.println(account.toString());

        scanner.close();
    }
}
