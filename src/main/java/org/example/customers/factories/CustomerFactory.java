package org.example.customers.factories;

import org.example.customers.Customer;

public class CustomerFactory {
    public Customer createCustomer(String uuid, String firstName, String lastName) {
        return new Customer(uuid, firstName, lastName);
    }
}

