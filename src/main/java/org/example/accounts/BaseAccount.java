package org.example.accounts;

import org.example.dataClasses.TransactionDetails;
import org.example.people.BaseHuman;

import java.util.ArrayList;

public class BaseAccount {
    private String uuid;

    private double balance;

    private String accountNumber;

    private BaseHuman owner;

    private ArrayList<TransactionDetails> DailyTransactions;
    public BaseAccount(String uuid, double balance, String accountNumber, BaseHuman owner) {
        this.uuid = uuid;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.DailyTransactions = new ArrayList<TransactionDetails>();
    }

    public String getUuid() {
        return uuid;
    }

    public ArrayList<TransactionDetails> getDailyTransactions() {return DailyTransactions;}

    public void addDailyTransactions(TransactionDetails Transaction) {this.DailyTransactions.add(Transaction);}

    public double getBalance() {
        return balance;
    }

    public void dailyTransactionsReset() {this.DailyTransactions = new ArrayList<TransactionDetails>();}

    public String getAccountNumber() {
        return accountNumber;
    }

    public BaseHuman getOwner() {
        return owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public BaseHuman GetOwner() {
        return owner;
    }
}