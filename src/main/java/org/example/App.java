package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.accounts.BankAccountWithPaymentCards;
import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.accounts.services.BankAccountWithPaymentCardsService;
import org.example.cards.PaymentCard;
import org.example.cards.factories.PaymentCardFactory;
import org.example.people.Customer;
import org.example.people.factories.CustomerFactory;

public class App {

    public static void run(String[] args) {
        // Inicializace Guice
        Injector injector = Guice.createInjector(new Container());

        // Získání instancí z injector
        BankAccountNumberGenerator generator = injector.getInstance(BankAccountNumberGenerator.class);
        CustomerFactory customerFactory = injector.getInstance(CustomerFactory.class);
        PaymentCardFactory paymentCardFactory = injector.getInstance(PaymentCardFactory.class);
        BankAccountWithPaymentCardsService bankAccountWithPaymentCardsService = injector.getInstance(BankAccountWithPaymentCardsService.class);

        // Vytvoření zákazníků
        Customer customer_1 = customerFactory.createCustomer(generator.generateRandomAccountNumber(), "Tomáš", "Dvořák");
        Customer customer_2 = customerFactory.createCustomer(generator.generateRandomAccountNumber(), "Honza", "Dvořák");

        // Vytvoření dvou platebních účtů
        BankAccountWithPaymentCards account_1 = new BankAccountWithPaymentCards("uuid1", "45678764567/0100", customer_1, 5000);
        BankAccountWithPaymentCards account_2 = new BankAccountWithPaymentCards("uuid2", "98765456566/0100", customer_2, 3000);

        // Vytvoření čtyř platebních karet
        PaymentCard card_1 = paymentCardFactory.create();
        PaymentCard card_2 = paymentCardFactory.create();
        PaymentCard card_3 = paymentCardFactory.create();
        PaymentCard card_4 = paymentCardFactory.create();

        // Přiřazení karet k účtům
        account_1.addPaymentCard(card_1);
        account_1.addPaymentCard(card_2);
        account_2.addPaymentCard(card_3);
        account_2.addPaymentCard(card_4);

        // Registrace účtů v servisní třídě
        bankAccountWithPaymentCardsService.addAccount(account_1);
        bankAccountWithPaymentCardsService.addAccount(account_2);

        // Test plateb
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 1. účtu je: " + account_1.getBalance() + " Kč");
        bankAccountWithPaymentCardsService.pay(card_1.getCardNumber(), 500);
        System.out.println("Na 1. účtu je: " + account_1.getBalance() + " Kč");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 1. účtu je: " + account_1.getBalance() + " Kč");
        bankAccountWithPaymentCardsService.pay(card_2.getCardNumber(), 1000);
        System.out.println("Na 1. účtu je: " + account_1.getBalance() + " Kč");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 2. účtu je: " + account_2.getBalance() + " Kč");
        bankAccountWithPaymentCardsService.pay(card_3.getCardNumber(), 500);
        System.out.println("Na 2. účtu je: " + account_2.getBalance() + " Kč");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Na 2. účtu je: " + account_2.getBalance() + " Kč");
        bankAccountWithPaymentCardsService.pay(card_4.getCardNumber(), 1000);
        System.out.println("Na 2. účtu je: " + account_2.getBalance() + " Kč");
        System.out.println("---------------------------------------------------------------------");

        // Info o kartě
        card_1.information();
        System.out.println("---------------------------------------------------------------------");
    }
}
