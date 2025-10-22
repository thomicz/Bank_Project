package org.example.logger;

public class PaymentLogger {

    public void logPayment(double amount, String cardNumber, double bankAccountNumber)
    {
        System.out.println("Platba " + amount + " Kc byla provedena kartou " + cardNumber + " z uctu " + bankAccountNumber);
    }
}
