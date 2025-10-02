package org.example;

import org.example.bankAccounts.StudentBankAccount;
import org.example.bankAccounts.SavingBankAccount;
import org.example.bankAccounts.generators.BankAccountNumberGenerator;
import org.example.bankAccounts.services.BankAccountService;
import org.example.people.BasePerson;
import org.example.people.NormalPerson;
import org.example.people.StudentPerson;
import org.example.customers.factories.CustomerFactory;
import org.example.customers.Customer;

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

