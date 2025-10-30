package org.example.cards.factories;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.cards.*;
import org.example.cards.generators.*;

import java.util.UUID;

@Singleton
public class PaymentCardFactory {

    private final PaymentCardNumberGenerator paymentCardNumberGenerator;
    private final PaymentCardCvvGenerator paymentCardCvvGenerator;
    private final PaymentCardPinGenerator paymentCardPinGenerator;
    private final PaymentCardExpirationCalculator paymentCardExpirationCalculator;

    @Inject
    public PaymentCardFactory(
            PaymentCardNumberGenerator paymentCardNumberGenerator,
            PaymentCardCvvGenerator paymentCardCvvGenerator,
            PaymentCardPinGenerator paymentCardPinGenerator,
            PaymentCardExpirationCalculator paymentCardExpirationCalculator
    ) {
        this.paymentCardNumberGenerator = paymentCardNumberGenerator;
        this.paymentCardCvvGenerator = paymentCardCvvGenerator;
        this.paymentCardPinGenerator = paymentCardPinGenerator;
        this.paymentCardExpirationCalculator = paymentCardExpirationCalculator;
    }

    public PaymentCard create() {
        String uuid = UUID.randomUUID().toString();
        String cardNumber = this.paymentCardNumberGenerator.generateCardNumber();
        String cvv = this.paymentCardCvvGenerator.generateCvv();
        String pin = this.paymentCardPinGenerator.generatePin();
        String expireMonth = this.paymentCardExpirationCalculator.calculateMonthExpire();
        String expireYear = this.paymentCardExpirationCalculator.calculateYearExpire();

        return new PaymentCard(uuid, cardNumber, cvv, pin, expireMonth, expireYear);
    }
}
