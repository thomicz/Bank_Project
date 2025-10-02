package org.example.bankAccounts.services;

public class AML {

    public boolean amlCheck(double amount) {
        if (amount > 10000)
        {
            throw new IllegalArgumentException("Transaction flagged for AML review.");
        }
        return true;
    }
}
