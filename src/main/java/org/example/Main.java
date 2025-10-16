package org.example;

import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.accounts.services.BankAccountService;
import org.example.cards.PaymentCard;
import org.example.people.customers.factories.CustomerFactory;
import org.example.people.customers.Customer;
import org.example.accounts.BankAccountWithPaymentCards;
import org.example.accounts.services.BankAccountWithPaymentCardsService;

public class Main {
    public static void main(String[] args) {

        BankAccountNumberGenerator generator = new BankAccountNumberGenerator();
        CustomerFactory customerFactory = new CustomerFactory();

        Customer customer_1 = customerFactory.createCustomer(generator.generateRandomAccountNumber(), "Tomáš", "Dvořák");
        Customer customer_2 = customerFactory.createCustomer(generator.generateRandomAccountNumber(), "Honza", "Dvořák");


        BankAccountWithPaymentCardsService service = new BankAccountWithPaymentCardsService();

        BankAccountWithPaymentCards acc1 = new BankAccountWithPaymentCards("uuid1", "123-456", customer_1, 5000);
        BankAccountWithPaymentCards acc2 = new BankAccountWithPaymentCards("uuid2", "987-654", customer_2, 3000);

        acc1.addPaymentCard(new PaymentCard("123", "4567897654", "123", "9865", "12", "12"));
        acc1.addPaymentCard(new PaymentCard("123", "4567897655", "123", "9865", "12", "12"));

        acc2.addPaymentCard(new PaymentCard("123", "4567897656", "123", "9865", "12", "12"));
        acc2.addPaymentCard(new PaymentCard("123", "4567897657", "123", "9865", "12", "12"));


        service.addAccount(acc1);
        service.addAccount(acc2);

        System.out.println(acc1.getBalance());
        service.pay("4567897654", 500);
        System.out.println(acc1.getBalance());
        service.pay("4567897655", 1000);
        System.out.println(acc1.getBalance());

        System.out.println(acc2.getBalance());
        service.pay("4567897656", 500);
        System.out.println(acc1.getBalance());
        service.pay("4567897657", 1000);
        System.out.println(acc1.getBalance());












    }
}

