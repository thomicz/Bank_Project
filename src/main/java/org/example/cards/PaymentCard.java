package org.example.cards;

public class PaymentCard {
    private String cardNumber;
    private String uuid;
    private String cvv;
    private String pin;
    private String expireMonth;
    private String expireYear;

    public PaymentCard(String cardNumber, String uuid, String cvv, String pin, String expireMonth, String expireYear) {
        this.cardNumber = cardNumber;
        this.uuid = uuid;
        this.cvv = cvv;
        this.pin = pin;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getUuid() {
        return uuid;
    }

    public String getCvv() {
        return cvv;
    }

    public String getPin() {
        return pin;
    }

    public String getExpireMonth() {
        return expireMonth;
    }

    public String getExpireYear() {
        return expireYear;
    }
}
