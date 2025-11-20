package org.example.cards;

import java.util.UUID;
import java.util.Random;

public class PaymentCardNumberGenerator {
    private static final Random random = new Random();

    public String generate() {
        // Např. generuj 16místné číslo – simulace Visa (začínající 4)
        StringBuilder sb = new StringBuilder("4");
        for (int i = 1; i < 16; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
