package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.accounts.factories.BankAccountFactory;
import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.cards.PaymentCard;
import org.example.cards.factories.PaymentCardFactory;
import org.example.people.factories.CustomerFactory;
import org.example.people.Customer;
import org.example.accounts.BankAccountWithPaymentCards;
import org.example.accounts.services.BankAccountWithPaymentCardsService;

public class Main {
    public static void main(String[] args) {

        App app = new App();
        app.run(args);

        Injector injector = Guice.createInjector(new AbstractModule() {});
    }
}

