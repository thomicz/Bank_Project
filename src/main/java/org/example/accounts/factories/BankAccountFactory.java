package org.example.accounts.factories;

import org.example.accounts.NormalBankAccount;
import org.example.accounts.SavingBankAccount;
import org.example.accounts.StudentBankAccount;
import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.people.Customer;

public class BankAccountFactory {

    private final BankAccountNumberGenerator bankAccountNumberGenerator = new BankAccountNumberGenerator();

    public NormalBankAccount createBankAccount(String uuid, Customer customer) {
        return new NormalBankAccount(
                uuid,
                bankAccountNumberGenerator.generateRandomAccountNumber(),
                customer
        );
    }

    public SavingBankAccount createSaveAccount(String uuid, Customer customer, float interestRate) {
        return new SavingBankAccount(
                uuid,
                bankAccountNumberGenerator.generateRandomAccountNumber(),
                customer,
                interestRate
        );
    }

    public StudentBankAccount createStudentAccount(String uuid, Customer customer, String schoolName) {
        return new StudentBankAccount(
                uuid,
                bankAccountNumberGenerator.generateRandomAccountNumber(),
                customer,
                schoolName
        );
    }
}