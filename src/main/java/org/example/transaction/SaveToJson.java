package org.example.transaction;

import org.example.accounts.services.CountInterestService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.FileWriter;
import java.io.IOException;


public class SaveToJson {

    CountInterestService countInterestService = new CountInterestService();
    private int minuteCounter = 0;


    public void start(String jsonData) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Minuta uběhla...");

            minuteCounter++;
                this.save(jsonData);
        }, 0, 1, TimeUnit.MINUTES);
    }

    public void save(String jsonData) {
        try (FileWriter file = new FileWriter("transactions.json")) {
            file.write(jsonData);
            file.flush();
            System.out.println("JSON byl úspěšně uložen do transactions.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
