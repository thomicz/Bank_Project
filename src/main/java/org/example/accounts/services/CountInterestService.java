package org.example.accounts.services;

public class CountInterestService {
    public double countInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }
}
