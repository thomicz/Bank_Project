package org.example.bankAccounts;

import org.example.people.BasePerson;
import org.example.people.StudentPerson;

public class StudentBankAccount extends BaseBankAccount {

    private final String schoolName;

    public StudentBankAccount(String uuid, double balance, int accountNumber, StudentPerson owner) {
        super(uuid, balance, accountNumber, owner);
        this.schoolName = owner.getSchool(); // getter z studentPerson
    }

    public String getSchool() {
        return schoolName;
    }
}
