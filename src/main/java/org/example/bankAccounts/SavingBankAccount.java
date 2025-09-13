package org.example.bankAccounts;

import org.example.people.BasePerson;

public class SavingBankAccount extends BaseBankAccount{

    double interestRate;

    public SavingBankAccount(String uuid, double balance, String accountNumber, BasePerson owner, double interestRate) {
        super(uuid, balance, accountNumber, owner);
        this.interestRate = interestRate;
    }
}
