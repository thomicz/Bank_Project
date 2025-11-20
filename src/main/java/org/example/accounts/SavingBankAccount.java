package org.example.accounts;

import org.example.people.BaseHuman;

import java.time.LocalDateTime;

public class SavingBankAccount extends BaseAccount {
    public double interestRate;
    public LocalDateTime nextInterestDate;


    public SavingBankAccount(String uuid, double balance, String accountNumber, BaseHuman owner, double interestRate, LocalDateTime nextInterestDate) {
        super(uuid, balance, accountNumber, owner);
        this.interestRate = interestRate;
        this.nextInterestDate = nextInterestDate;
    }
}