package org.example.cards;

import java.util.Random;

public class PaymentCardCvvGenerator {
    private static final Random random = new Random();

    public String generate() {
        // Standardní CVV má 3 číslice
        int cvv = 100 + random.nextInt(900);
        return String.valueOf(cvv);
    }
}
