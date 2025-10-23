package org.example;

import org.example.accounts.BankAccountWithPaymentCards;
import org.example.cards.PaymentCard;
import org.example.people.Customer;

public class App {

    public static void run(String[] args) {
        Container container = new Container();

        //Vytvoření zákazníků
        Customer customer_1 = container.customerFactory.createCustomer(container.generator.generateRandomAccountNumber(), "Tomáš", "Dvořák");
        Customer customer_2 = container.customerFactory.createCustomer(container.generator.generateRandomAccountNumber(), "Honza", "Dvořák");

        //Vytvoření dvou platebních účtů
        BankAccountWithPaymentCards account_1 = new BankAccountWithPaymentCards("uuid1", "45678764567/0100", customer_1, 5000);
        BankAccountWithPaymentCards account_2 = new BankAccountWithPaymentCards("uuid2", "98765456566/0100", customer_2, 3000);

        //Vytvoření 4 platebních karet
        PaymentCard card_1 = container.paymentCardFactory.create();
        PaymentCard card_2 = container.paymentCardFactory.create();
        PaymentCard card_3 = container.paymentCardFactory.create();
        PaymentCard card_4 = container.paymentCardFactory.create();

        //Přidání 2 karet k prvnímu účtu
        account_1.addPaymentCard(card_1);
        account_1.addPaymentCard(card_2);

        //Přidání 2 karet k druhému účtu
        account_2.addPaymentCard(card_3);
        account_2.addPaymentCard(card_4);

        //Přidání obou účtů do servisní třídy
        container.bankAccountWithPaymentCardsService.addAccount(account_1);
        container.bankAccountWithPaymentCardsService.addAccount(account_2);

        //Tady zkouším, jestli funguje placení
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 1. uctu je: " + account_1.getBalance() + "Kc");
        container.bankAccountWithPaymentCardsService.pay(card_1.getCardNumber(), 500);
        System.out.println("Na 1. uctu je: " + account_1.getBalance() + "Kc");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 1. uctu je: " + account_1.getBalance() + "Kc");
        container.bankAccountWithPaymentCardsService.pay(card_2.getCardNumber(), 1000);
        System.out.println("Na 1. uctu je: " + account_1.getBalance() + "Kc");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 2. uctu je: " + account_2.getBalance() + "Kc");
        container.bankAccountWithPaymentCardsService.pay(card_3.getCardNumber(), 500);
        System.out.println("Na 2. uctu je: " + account_2.getBalance() + "Kc");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 2. uctu je: " + account_2.getBalance() + "Kc");
        container.bankAccountWithPaymentCardsService.pay(card_4.getCardNumber(), 1000);
        System.out.println("Na 2. uctu je: " + account_2.getBalance() + "Kc");
        System.out.println("---------------------------------------------------------------------");
        card_1.information();
        System.out.println("---------------------------------------------------------------------");


    }
}
