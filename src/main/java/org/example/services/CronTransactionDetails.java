package org.example.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.fasada.TransactionDatas;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
@Singleton
public class CronTransactionDetails {
    @Inject
    TransactionDatas datas;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


    public void start() {
        scheduler.scheduleAtFixedRate(
                () -> datas.TransactionDetails().run()
                ,
                0,
                5,
                TimeUnit.MINUTES
        );

    }
}
