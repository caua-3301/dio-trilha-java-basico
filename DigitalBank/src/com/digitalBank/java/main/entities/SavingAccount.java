package com.digitalBank.java.main.entities;

public class SavingAccount extends Account{
    private double taxRentable;

    public SavingAccount(String numberAccount, String agencyNumber, double balance, double taxRentable) {
        super(numberAccount, agencyNumber, balance);
        this.taxRentable = taxRentable;
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

    public void rentableAcctivate() {
        setBalance(getBalance() * (1 + taxRentable));
    }

    public double getTaxRentable() {
        return taxRentable;
    }

    public void setTaxRentable(double taxRentable) {
        this.taxRentable = taxRentable;
    }
}
