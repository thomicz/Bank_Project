package org.example.bankAccounts;

import org.example.customers.Customer;

public class NormalBankAccount extends BaseBankAccount {
    public NormalBankAccount(String uuid, String bankAccountNumber, Customer customer) {
        super(uuid, bankAccountNumber, customer, 0);
    }
}
