package org.example.people;

import org.example.bankAccounts.BaseBankAccount;

public class NormalPerson extends BasePerson {

    private BaseBankAccount baseAccount;

    public NormalPerson(String uuid, String firstName, String lastName, BaseBankAccount account) {
        super(uuid, firstName, lastName);
        this.baseAccount = account;
    }


}
