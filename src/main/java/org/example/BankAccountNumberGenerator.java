package org.example;

public class BankAccountNumberGenerator {

    public int generateBankAccountNumber() {
        return (int)(Math.random() * 900000) + 100000;
    }
}
