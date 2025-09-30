package org.example.bankAccounts.services;

import org.example.bankAccounts.BaseBankAccount;

public class BankAccountService {

    public void deposit(BaseBankAccount account, int amount)
    {
        if(amount <= 0)
        {
            throw new  IllegalArgumentException("Amount must be greater than 0.");
        }



        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
    }

    public void withdraw(BaseBankAccount account, int amount)
    {
        if(amount <= 0)
        {
            throw new  IllegalArgumentException("Amount must be greater than 0.");
        }

        if(account.getBalance() >= amount)
        {
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
        }
        else
        {
            throw new  IllegalArgumentException("Unable to withdraw due to insufficient balance.");
        }

    }
}
