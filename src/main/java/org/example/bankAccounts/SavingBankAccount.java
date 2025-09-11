package org.example.bankAccounts;

import org.example.people.BaseHuman;

public class SavingBankAccount extends BaseAccount {
    double interestRate;

    public SavingBankAccount(String uuid, double balance, String accountNumber, BaseHuman owner, double interestRate) {
        super(uuid, balance, accountNumber, owner);
        this.interestRate = interestRate;
    }
}