package org.example;

import org.example.accounts.generators.BankAccountNumberGenerator;
import org.example.accounts.services.BankAccountWithPaymentCardsService;
import org.example.cards.factories.PaymentCardFactory;
import org.example.people.factories.CustomerFactory;

public class Container {
    BankAccountNumberGenerator generator = new BankAccountNumberGenerator();
    CustomerFactory customerFactory = new CustomerFactory();
    PaymentCardFactory paymentCardFactory = new PaymentCardFactory();
   BankAccountWithPaymentCardsService bankAccountWithPaymentCardsService = new BankAccountWithPaymentCardsService();
}
