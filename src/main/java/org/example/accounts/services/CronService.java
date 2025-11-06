package org.example.accounts.services;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CronService {

    CountInterestService countInterestService = new CountInterestService();
    private int minuteCounter = 0;

    public void start() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Cron: každou minutu");

            minuteCounter++;
            if (minuteCounter % 5 == 0) {
                applyInterest();
            }
        }, 0, 1, TimeUnit.MINUTES);
    }

    private void applyInterest() {
        System.out.println("Úročení účtů probíhá...");
        countInterestService.countInterest(100000, 0.01);
    }

    public static void main(String[] args) {
        CronService cron = new CronService();
        cron.start();
    }
}
