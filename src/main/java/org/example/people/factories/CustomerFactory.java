package org.example.people.factories;

import org.example.people.Customer;

public class CustomerFactory {
    public Customer createCustomer(String uuid, String firstName, String lastName) {
        return new Customer(uuid, firstName, lastName);
    }
}

