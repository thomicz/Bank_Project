package org.example.transaction;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private String datum;
    private Transaction transaction;

    List<Transaction> transactions;

    public void SaveToJson()
    {
        Gson gson = new Gson();
        String json = gson.toJson(transactions);

        SaveToJson stj = new SaveToJson();
        stj.start(json);

    }

    public Transaction getTransaction() {
        return transaction;
    }

    public TransactionManager(String datum, Transaction transaction) {
        this.datum = datum;
        this.transaction = transaction;
        this.transactions = new ArrayList<>();
        if (transaction != null) {
            transactions.add(transaction);
        }
    }
}
