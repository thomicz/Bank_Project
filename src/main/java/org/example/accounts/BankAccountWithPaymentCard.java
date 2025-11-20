package org.example.accounts;
import org.example.cards.PaymentCard;
import org.example.people.BaseHuman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccountWithPaymentCard extends BaseAccount {
    protected final List<PaymentCard> paymentCards;
    protected final Map<String, PaymentCard> paymentCardMap;

    public List<PaymentCard> getPaymentCards() {
        return paymentCards;
    }

    public BankAccountWithPaymentCard(String uuid, double balance, String accountNumber, BaseHuman owner) {
        super(uuid, balance, accountNumber, owner);
    this.paymentCards = new ArrayList<>();
    this.paymentCardMap = new HashMap<>();
    }
    public void addPaymentCard(PaymentCard paymentCard) {
        this.paymentCards.add(paymentCard);
        this.paymentCardMap.put(paymentCard.getCardNumber(), paymentCard);
    }

}
