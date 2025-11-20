package org.example.services;

import com.google.inject.Inject;
import org.example.accounts.BaseAccount;
import org.example.factories.TransactionDetailsFactory;

public class TransactionDater {
    @Inject
    TransactionDetailsFactory transactionDetailsFactory;
    public void addTransactionInfo(BaseAccount acc,double amount,String type,boolean byCard)
    {
        acc.addDailyTransactions(transactionDetailsFactory.createTransactionDetails(amount,type,byCard,acc));
    }
}
