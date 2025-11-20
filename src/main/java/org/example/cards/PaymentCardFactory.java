package org.example.cards;

import jakarta.inject.Inject;

import java.util.UUID;

public class PaymentCardFactory {
    @Inject
    private PaymentCardNumberGenerator paymentCardNumberGenerator;
    @Inject
    private PaymentCardCvvGenerator paymentCardCvvGenerator;
    @Inject
    private PaymentCardPinGenerator paymentCardPinGenerator;
    @Inject
    private PaymentCardExpireDateGenerator paymentCardExpireDateGenerator;
    @Inject
    public PaymentCardFactory(PaymentCardNumberGenerator paymentCardNumberGenerator, PaymentCardCvvGenerator paymentCardCvvGenerator, PaymentCardPinGenerator paymentCardPinGenerator, PaymentCardExpireDateGenerator paymentCardExpireDateGenerator) {
        this.paymentCardNumberGenerator = paymentCardNumberGenerator;
        this.paymentCardCvvGenerator = paymentCardCvvGenerator;
        this.paymentCardPinGenerator = paymentCardPinGenerator;
        this.paymentCardExpireDateGenerator = paymentCardExpireDateGenerator;
    }

    public PaymentCard create() {
        String uuid = UUID.randomUUID().toString();
        String cardNumber = this.paymentCardNumberGenerator.generate();
        String cvv = this.paymentCardCvvGenerator.generate();
        String pin = this.paymentCardPinGenerator.generate();
        String expireMonth = this.paymentCardExpireDateGenerator.CalculateMonthExpire();
        String expireYear = this.paymentCardExpireDateGenerator.CalculateYearExpire();

        return new PaymentCard(cardNumber,uuid, cvv, pin, expireMonth, expireYear);
    }
}
