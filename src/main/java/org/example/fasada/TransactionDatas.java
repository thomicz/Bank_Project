package org.example.fasada;

import com.google.inject.Singleton;
import jakarta.inject.Inject;
import org.example.accounts.BaseAccount;
import org.example.storages.AccountStorage;
import org.example.logger.ExportTransactionFile;
import org.example.dataClasses.TransactionDetails;

@Singleton
public class TransactionDatas {
    @Inject
    AccountStorage accountStorage;
    @Inject
    ExportTransactionFile exportTransactionFile;

    public Runnable TransactionDetails()
        {
        return () -> {
          for (BaseAccount account : accountStorage.getAccounts())
          {
                int a = account.getDailyTransactions().size();
                for(TransactionDetails details : account.getDailyTransactions())
                {
                    exportTransactionFile.CreateFile(details);
                    System.out.println(a);
                    a= a-1;
                }
                account.dailyTransactionsReset();

          }
        };
        }
}
