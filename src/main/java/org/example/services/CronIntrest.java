package org.example.services;

import com.google.inject.Singleton;
import jakarta.inject.Inject;
import org.example.fasada.SavingBankAccountinterstCalc;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
@Singleton
public class CronIntrest {

    @Inject
    SavingBankAccountinterstCalc savingBankAccountinterstCalc;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


    public void start() {
        scheduler.scheduleAtFixedRate(
                () -> savingBankAccountinterstCalc.calc().run()
                ,
                0,
                20,
                TimeUnit.SECONDS
        );

    }
}
