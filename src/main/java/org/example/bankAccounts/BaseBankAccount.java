package org.example.bankAccounts;

import org.example.people.BasePerson;

public class BaseBankAccount {
    private String uuid;
    private double balance;
    private String accountNumber;
    private BasePerson owner;

    public BaseBankAccount(String uuid, double balance, String accountNumber, BasePerson owner) {
        this.uuid = uuid;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.owner = owner;
    }

    public String getUuid() {
        return uuid;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BasePerson getOwner() {
        return owner;
    }

    public void AddBalance(double balance) {
        this.balance += balance;
    }

    public void ReduceBalance(double balance) {
        if(this.balance >= balance) {
            this.balance -= balance;
        }
    }
}
