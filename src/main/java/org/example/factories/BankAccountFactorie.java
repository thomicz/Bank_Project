package org.example.factories;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.BankAccount;
import org.example.accounts.SavingBankAccount;
import org.example.accounts.StudentBankAccount;
import org.example.BankAccountNum;
import org.example.storages.AccountStorage;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.services.IntrestNextMonthDate;

@Singleton
public class BankAccountFactorie {
    @Inject
    public AccountStorage accountStorage;
    @Inject
    IntrestNextMonthDate nextMonthDate;
    @Inject
    public BankAccountFactorie(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }
    public BankAccount createBankAccount(String uuid, BaseHuman owner,double balanc) {
        BankAccount acc = new BankAccount(uuid,balanc,String.valueOf(BankAccountNum.generator()),owner);
        System.out.println("idhjkjskdsmnds");
        accountStorage.addAccount(acc);
        return acc;
    }
    public StudentBankAccount createStudentBankAccount(String uuid,double balance,Student owner) {
        StudentBankAccount acc =  new StudentBankAccount(uuid,balance,String.valueOf(BankAccountNum.generator()),owner);
        accountStorage.addAccount(acc);
        return acc;
    }
    public SavingBankAccount createSavingBankAccount(String uuid,double balance,BaseHuman owner,double interestRate) {
        SavingBankAccount acc = new SavingBankAccount(uuid,balance,String.valueOf(BankAccountNum.generator()),owner,interestRate,nextMonthDate.NextMonthDate());
        accountStorage.addAccount(acc);
        return acc;
    }

}
