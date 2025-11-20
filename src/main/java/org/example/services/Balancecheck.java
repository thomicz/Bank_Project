package org.example.services;

import org.example.accounts.BaseAccount;

public class Balancecheck {
    public boolean depositcheck(BaseAccount account, double amount){
        if (amount < 0) {
            throw new IllegalArgumentException("oprav jsi to ");
        }
        if(amount >= 10000) {
            System.err.println("moc velka častka ");
            return false;
        }
        return  true;
    }
    public boolean withdrawcheck(BaseAccount account, double amount){
        if (account.getBalance() - amount < 0) {
            throw new IllegalArgumentException("tolik penez nemaš ");
        }
        if(amount >= 10000) {
            System.err.println("moc velka častka na vybrani ");
            return false;
        }
        return  true;
    }
}
