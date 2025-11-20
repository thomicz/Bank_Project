package org.example.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class IntrestNextMonthDate {
    public LocalDateTime NextMonthDate(){
        /*return LocalDate.now().plusMonths(1);*/
        return LocalDateTime.now().plusSeconds(19);
    }
}
