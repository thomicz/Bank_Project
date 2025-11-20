package org.example;
import java.util.Random;

public class BankAccountNum
{
    public static long generator()
    {
        Random rnd = new Random();
        return 1_000_000_000L + (long)(rnd.nextDouble() * 9_000_000_000L);

    }
}
