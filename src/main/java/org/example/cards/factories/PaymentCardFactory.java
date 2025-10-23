package org.example.cards.factories;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.cards.*;
import org.example.cards.generators.PaymentCardCvvGenerator;
import org.example.cards.generators.PaymentCardExpirationCalculator;
import org.example.cards.generators.PaymentCardNumberGenerator;
import org.example.cards.generators.PaymentCardPinGenerator;

import java.util.UUID;

@Singleton
public class PaymentCardFactory {

    @Inject
    private final PaymentCardNumberGenerator paymentCardNumberGenerator = new PaymentCardNumberGenerator();
    @Inject
    private final PaymentCardCvvGenerator paymentCardCvvGenerator = new PaymentCardCvvGenerator();
    @Inject
    private final PaymentCardPinGenerator paymentCardPinGenerator = new PaymentCardPinGenerator();
    @Inject
    private final PaymentCardExpirationCalculator paymentCardExpirationCalculator = new PaymentCardExpirationCalculator();

    public PaymentCard create() {

        String uuid = UUID.randomUUID().toString();
        String cardNUmber = this.paymentCardNumberGenerator.generateCardNumber();
        String cvv = this.paymentCardCvvGenerator.generateCvv();
        String pin = this.paymentCardPinGenerator.generatePin();
        String expireMonth = this.paymentCardExpirationCalculator.calculateMonthExpire();
        String expireYear = this.paymentCardExpirationCalculator.calculateYearExpire();

        return new PaymentCard(uuid, cardNUmber, cvv, pin, expireMonth, expireYear);
    }

}
