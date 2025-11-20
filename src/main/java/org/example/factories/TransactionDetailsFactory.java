package org.example.factories;

import org.example.accounts.BaseAccount;
import org.example.dataClasses.TransactionDetails;

public class TransactionDetailsFactory {
    public TransactionDetails createTransactionDetails(double amount, String type, boolean byCard, BaseAccount acc) {
        return new TransactionDetails(amount,type,byCard,acc);
    }
}
