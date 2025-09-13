package org.example.bankAccounts;

import org.example.people.BasePerson;
import org.example.people.StudentPerson;

public class StudentBankAccount extends BaseBankAccount {

    private String school;

    public StudentBankAccount(String uuid, double balance, String accountNumber, StudentPerson owner) {
        super(uuid, balance, accountNumber, owner);
        this.school = owner.getSchool(); // getter z studentPerson
    }

    public String getSchool() {
        return school;
    }
}
