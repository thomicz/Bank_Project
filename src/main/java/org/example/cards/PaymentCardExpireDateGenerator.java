package org.example.cards;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PaymentCardExpireDateGenerator {

    public String CalculateMonthExpire() {
        // Vrací měsíc expirace (např. 10)
        LocalDate now = LocalDate.now();
        return String.format("%02d", now.getMonthValue());
    }

    public String CalculateYearExpire() {
        // Karta platí např. 4 roky od teď
        LocalDate now = LocalDate.now().plusYears(4);
        return String.valueOf(now.getYear()).substring(2); // např. "29"
    }
}
