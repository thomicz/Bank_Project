package org.example;

import org.example.bankAccounts.BaseBankAccount;
import org.example.bankAccounts.StudentBankAccount;
import org.example.bankAccounts.SavingBankAccount;
import org.example.people.BasePerson;
import org.example.people.NormalPerson;
import org.example.people.StudentPerson;

public class Main {
    public static void main(String[] args) {

        //Vytvoření běžné osoby a spořicího účtu
        BasePerson tomas = new BasePerson("p1", "Tomáš", "Dvořák");
        SavingBankAccount tomasAccount = new SavingBankAccount("a1", 1000, "123456", tomas, 0.05);

        NormalPerson normal = new NormalPerson("p2", "Jan", "Novák", tomasAccount);

        System.out.println("Normal Person: " + normal.getFirstName() + " " + normal.getLastName());

        //Vytvoření studenta a studentského účtu
        StudentPerson student = new StudentPerson("p3", "Petr", "Svoboda", "Gymnázium ABC");
        StudentBankAccount studentAccount = new StudentBankAccount("a2", 500, "654321", student);

        System.out.println("\nStudent Person: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("School: " + studentAccount.getSchool());
        System.out.println("Balance: " + studentAccount.getBalance());
    }
}

