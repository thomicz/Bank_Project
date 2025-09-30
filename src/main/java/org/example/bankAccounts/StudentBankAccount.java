package org.example.bankAccounts;

import org.example.customers.Customer;
import org.example.people.StudentPerson;

public class StudentBankAccount extends BaseBankAccount {

    private final String schoolName;

    public StudentBankAccount(String uuid, String bankAccountNumber, Customer customer, String schoolName) {
        super(uuid, bankAccountNumber, new Customer(customer.getUuid(), "Tom", "Dvořák"), 0);

        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
