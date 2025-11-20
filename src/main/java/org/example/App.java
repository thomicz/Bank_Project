package org.example;
import com.google.inject.Singleton;
import jakarta.inject.Inject;
import org.example.accounts.*;
import org.example.cards.PaymentCardFactory;
import org.example.factories.BankAccountFactorie;
import org.example.fasada.SavingBankAccountinterstCalc;
import org.example.people.BaseHuman;
import org.example.people.Student;
import org.example.storages.AccountStorage;
import org.example.seriliatition.AccountOwnerJsonSeriliazeService;
import org.example.services.*;

@Singleton
public class App {
    @Inject
    PaymentCardFactory paymentCardFactory;

    @Inject
    BankAccountFactorie bankAccountFactorie;
    @Inject
    Balancemanager balancemanager;
    @Inject
    AccountOwnerJsonSeriliazeService accountOwnerJsonSeriliazeService;
    @Inject
    Logger logger;
    @Inject
    AccountStorage accountStorage;
    @Inject
    SavingBankAccountinterstCalc savingBankAccountinterstCalc;
    @Inject
    CronIntrest cronIntrest;
    @Inject
    IntrestCalc intrestCalc;
    @Inject
    IntrestNextMonthDate intrestNextMonthDate;
    @Inject
    CronTransactionDetails cronTransactionDetails;
    public void run()
    {


        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,String.valueOf(BankAccountNum.generator()), (new Student("76543456","Filip", "Rokos", "Delta")));
        BaseAccount account = new BaseAccount("7456",1000,String.valueOf(BankAccountNum.generator()),(new BaseHuman("7456","Honza","Va")));
        BankAccountWithPaymentCard cardAccount = new BankAccountWithPaymentCard("745600",10000,String.valueOf(BankAccountNum.generator()),(new BaseHuman("745600","Vojta","Kaška")));
        SavingBankAccount save = bankAccountFactorie.createSavingBankAccount("98789",876,(new BaseHuman("98789","vojta","kaška")),3.06);
        BankAccount acc = bankAccountFactorie.createBankAccount("7456",(new BaseHuman("7456","Honza","Va")),1000);
        System.out.println("Bank account created");
        balancemanager.addBalance(acc,1000);
        BankAccount accc = bankAccountFactorie.createBankAccount("74560",(new BaseHuman("74560","onza","Va")),1000);
        cronIntrest.start();
        cronTransactionDetails.start();
        acc.addPaymentCard(paymentCardFactory.create());
        if (accountStorage.getAccounts() == null)
        {
            System.out.println("Account storage is null");
        }
        else {
            System.out.println(accountStorage.getAccounts().size());
        }
        while (true) {
            try {
                Thread.sleep(10000); // jen uspíme hlavní vlákno
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
