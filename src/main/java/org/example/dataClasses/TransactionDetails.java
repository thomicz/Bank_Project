package org.example.dataClasses;

import org.example.accounts.BaseAccount;

import java.time.LocalDateTime;

public class TransactionDetails {
    private double amount;
    private String type;
    private boolean byCard;
    private LocalDateTime date;
    private transient BaseAccount account;
    public TransactionDetails(double amount, String type, boolean byCard, BaseAccount account) {
        this.amount = amount;
        this.type = type;
        this.byCard = byCard;
        this.date = LocalDateTime.now();
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public boolean isByCard() {
        return byCard;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BaseAccount getAccount() {
        return account;
    }
}
