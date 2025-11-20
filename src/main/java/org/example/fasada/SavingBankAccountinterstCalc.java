package org.example.fasada;

import com.google.inject.Singleton;
import jakarta.inject.Inject;
import org.example.accounts.BaseAccount;
import org.example.accounts.SavingBankAccount;
import org.example.storages.AccountStorage;
import org.example.services.IntrestCalc;
import org.example.services.IntrestNextMonthDate;
import org.example.services.TransactionDater;

import java.time.LocalDateTime;

@Singleton
public class SavingBankAccountinterstCalc {
    @Inject
    AccountStorage accountStorage;
    @Inject
    IntrestNextMonthDate intrestNextMonthDate;
    @Inject
    IntrestCalc intrestCalc;
    @Inject
    TransactionDater transactionDater;
    public Runnable calc()
    {
        return () -> {

            LocalDateTime currentDate = LocalDateTime.now();

            for (BaseAccount account : accountStorage.getAccounts()) {
                                if (account instanceof SavingBankAccount acc) {
                    if (!currentDate.isBefore(acc.nextInterestDate)) {

                        acc.nextInterestDate = intrestNextMonthDate.NextMonthDate();
                        intrestCalc.increase(acc);
                        System.out.println("------------------------");
                        System.out.println(acc.getBalance()+ "  " + LocalDateTime.now());
                        System.out.println("------------------------");
                    }
                }

            }
        };
    }
}
