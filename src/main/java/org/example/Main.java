package org.example;

import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.accounts.services.BankAccountService;
import org.example.people.customers.factories.CustomerFactory;
import org.example.people.customers.Customer;

public class Main {
    public static void main(String[] args) {



        BankAccountNumberGenerator generator = new BankAccountNumberGenerator(); //Tady zakládám instanci třídy BankAccountNumberGenerator
        BankAccountService service = new BankAccountService();
        CustomerFactory customerFactory = new CustomerFactory();

        BasePerson person = new BasePerson(
                "1",
                "John",
                "Doe"
        );

        Customer owner = customerFactory.createCustomer("1", person.getFirstName(), person.getLastName());


    }
}

