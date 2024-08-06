package com.digitalBank.java.main.entities;

public class CurrentAccount extends Account {
    public CurrentAccount(String numberAccount, String agencyNumber, double balance) {
        super(numberAccount, agencyNumber, balance);
    }

    @Override
    public void deposit(double value) {
        setBalance(getBalance() + value);
    }

    @Override
    public double withdraw(double value) {
        setBalance(getBalance() - value);

        return getBalance();
    }
}
