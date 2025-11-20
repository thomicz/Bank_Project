package org.example.cards;

import java.util.Random;

public class PaymentCardPinGenerator {
    private static final Random random = new Random();

    public String generate() {
        // PIN má typicky 4 číslice
        int pin = 1000 + random.nextInt(9000);
        return String.valueOf(pin);
    }
}
