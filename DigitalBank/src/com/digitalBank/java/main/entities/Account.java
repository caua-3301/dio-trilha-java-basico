package com.digitalBank.java.main.entities;

import java.util.Objects;

public abstract class Account implements com.digitalBank.java.main.myInterfaces.Account {
    private String numberAccount;
    private String agencyNumber;
    private double balance;

    public Account(String numberAccount, String agencyNumber, double balance) {
        this.numberAccount = numberAccount;
        this.agencyNumber = agencyNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount='" + numberAccount + '\'' +
                ", agencyNumber='" + agencyNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return Objects.equals(numberAccount, account.numberAccount);
    }

    @Override
    public int hashCode() {
        return numberAccount != null ? numberAccount.hashCode() : 0;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(String agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
