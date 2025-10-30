package org.example;

import com.google.inject.AbstractModule;
import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.accounts.services.BankAccountWithPaymentCardsService;
import org.example.cards.factories.PaymentCardFactory;
import org.example.cards.generators.*;
import org.example.people.factories.CustomerFactory;

public class Container extends AbstractModule {
    @Override
    protected void configure() {
        // Registrace všech tříd, které bude Guice vytvářet
        bind(BankAccountNumberGenerator.class);
        bind(CustomerFactory.class);
        bind(PaymentCardFactory.class);
        bind(BankAccountWithPaymentCardsService.class);

        // Generátory, které PaymentCardFactory používá
        bind(PaymentCardNumberGenerator.class);
        bind(PaymentCardCvvGenerator.class);
        bind(PaymentCardPinGenerator.class);
        bind(PaymentCardExpirationCalculator.class);
    }
}
