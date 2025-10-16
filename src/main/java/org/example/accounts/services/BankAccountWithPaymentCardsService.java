package org.example.accounts.services;

import org.example.accounts.BankAccountWithPaymentCards;
import org.example.cards.PaymentCard;
import java.util.ArrayList;
import java.util.List;

public class BankAccountWithPaymentCardsService extends BankAccountService {

    private final List<BankAccountWithPaymentCards> accounts = new ArrayList<>();

    public void addAccount(BankAccountWithPaymentCards account) {
        accounts.add(account);
    }

    public void pay(String cardNumber, double amount) {
        BankAccountWithPaymentCards account = findAccountByCardNumber(cardNumber);

        if (account == null) {
            System.out.println("Nebyl nalezen žádný účet s kartou " + cardNumber);
            return;
        }

        PaymentCard card = account.paymentCardsMap.get(cardNumber);
        if (card == null) {
            System.out.println("Karta " + cardNumber + " neexistuje u tohoto účtu.");
            return;
        }

        if (account.getBalance() < amount) {
            System.out.println("Nedostatek peněz na účtu.");
            return;
        }

        account.setBalance(account.getBalance() - amount);
        System.out.println("Platba " + amount + " Kc byla provedena kartou " + cardNumber +
                " z uctu " + account.getBankAccountNumber());
    }

    private BankAccountWithPaymentCards findAccountByCardNumber(String cardNumber) {
        for (BankAccountWithPaymentCards account : accounts) {
            if (account.paymentCardsMap.containsKey(cardNumber)) {
                return account;
            }
        }
        return null;
    }
}
