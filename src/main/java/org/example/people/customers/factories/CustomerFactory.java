package org.example.people.customers.factories;

import org.example.people.customers.Customer;

public class CustomerFactory {
    public Customer createCustomer(String uuid, String firstName, String lastName) {
        return new Customer(uuid, firstName, lastName);
    }
}

