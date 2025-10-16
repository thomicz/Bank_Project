package org.example.accounts;

import org.example.people.Customer;

public class NormalBankAccount extends BankAccountWithPaymentCards {
    public NormalBankAccount(String uuid, String bankAccountNumber, Customer customer) {
        super(uuid, bankAccountNumber, customer, 0);
    }


}
