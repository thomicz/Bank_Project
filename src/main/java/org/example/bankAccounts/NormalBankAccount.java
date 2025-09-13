package org.example.bankAccounts;

import org.example.people.BasePerson;

public class NormalBankAccount extends BaseBankAccount {
    public NormalBankAccount(String uuid, double balance, String accountNumber, BasePerson owner) {
        super(uuid, balance, accountNumber, owner);
    }
}
