
package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  Container container = new Container();
        BaseAccount studentskyAccount = new StudentBankAccount("895",1000,String.valueOf(Bankaccountnum.generator()), (new Student("76543456","Filip", "Rokos", "Delta")));
        BaseAccount account = new BaseAccount("7456",1000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("7456","Honza","Va")));
        BankAccountWithPaymentCard cardAccount = new BankAccountWithPaymentCard("745600",10000,String.valueOf(Bankaccountnum.generator()),(new BaseHuman("745600","Vojta","Kaška")));

        container.bankAccountFactorie.createBankAccount("7456",(new BaseHuman("7456","Honza","Va")),1000);
        */


        Injector injector = Guice.createInjector(new BankInjector());
        App app = injector.getInstance(App.class);
        app.run();

    }

    }

