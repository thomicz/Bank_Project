package org.example;

import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.accounts.services.BankAccountService;
import org.example.people.customers.factories.CustomerFactory;
import org.example.people.customers.Customer;

public class Main {
    public static void main(String[] args) {

        BankAccountNumberGenerator generator = new BankAccountNumberGenerator();
        BankAccountService service = new BankAccountService();
        CustomerFactory customerFactory = new CustomerFactory();

        Customer customer_1 = customerFactory.createCustomer(generator.generateRandomAccountNumber(), "Tomáš", "Dvořák");








    }
}

