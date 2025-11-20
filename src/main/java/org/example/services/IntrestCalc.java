package org.example.services;

import com.google.inject.Inject;
import org.example.accounts.SavingBankAccount;

public class IntrestCalc {
    @Inject
    TransactionDater transactionDater;
    public void increase(SavingBankAccount account)
    {
        transactionDater.addTransactionInfo(account,(account.getBalance() * ((account.interestRate / 100.0) / 12)),"IntrestIncrease",false);
        account.setBalance(account.getBalance() + (account.getBalance() * ((account.interestRate / 100.0) / 12)));

    }
}
