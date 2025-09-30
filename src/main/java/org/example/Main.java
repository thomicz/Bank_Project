package org.example;

import org.example.bankAccounts.StudentBankAccount;
import org.example.bankAccounts.SavingBankAccount;
import org.example.bankAccounts.generators.BankAccountNumberGenerator;
import org.example.bankAccounts.services.BankAccountService;
import org.example.people.BasePerson;
import org.example.people.NormalPerson;
import org.example.people.StudentPerson;

public class Main {
    public static void main(String[] args) {

        BankAccountNumberGenerator generator = new BankAccountNumberGenerator(); //Tady zakládám instanci třídy BankAccountNumberGenerator
        BankAccountService service = new BankAccountService();

        //Vytvoření normální osoby a spořicího účtu
        BasePerson tomas = new BasePerson("p1", "Tomáš", "Dvořák");
        //SavingBankAccount tomasAccount = new SavingBankAccount("a1", 1000, generator.generateRandomAccountNumber(), tomas, 0.05);


        //NormalPerson normal = new NormalPerson("p2", "Jan", "Novák", tomasAccount);

        //Výpis normálního člověka
        //System.out.println("Normal Person: " + normal.getFirstName() + " " + normal.getLastName());
        //System.out.println("Balance: " + tomasAccount.getBalance());
        //System.out.println("Account number: " + tomasAccount.getBankAccountNumber());

        //Přidání zůstatku
        //service.deposit(tomasAccount, 500);
        //System.out.println("New balance: " + tomasAccount.getBalance());

        //Odebrání zůstatku
        //service.withdraw(tomasAccount, 1400);
        //System.out.println("New balance: " + tomasAccount.getBalance());





        //Vytvoření studenta a studentského účtu
        StudentPerson student = new StudentPerson("p3", "Petr", "Svoboda", "Delta");
        //StudentBankAccount studentAccount = new StudentBankAccount("a2", 500, generator.generateRandomAccountNumber(), student);

        System.out.println("\nStudent Person: " + student.getFirstName() + " " + student.getLastName());
        //System.out.println("School: " + studentAccount.getSchoolName());
        //System.out.println("Balance: " + studentAccount.getBalance());
        //System.out.println("Account number: " + studentAccount.getBankAccountNumber());

    }
}

