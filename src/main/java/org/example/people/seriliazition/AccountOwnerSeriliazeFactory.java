package org.example.people.seriliazition;

import org.example.people.AccountOwner;
import org.example.people.BaseHuman;

public class AccountOwnerSeriliazeFactory {
    public AccountOwnerSeriliaze createAccountOwnerSeriliaze(BaseHuman accountOwner){
        AccountOwnerSeriliaze accountOwnerSeriliaze = new AccountOwnerSeriliaze();

        accountOwnerSeriliaze.uuid = accountOwner.getUuid();
        accountOwnerSeriliaze.firstName = accountOwner.getFirstName();
        accountOwnerSeriliaze.lastName = accountOwner.getLastName();
        return accountOwnerSeriliaze;
    }
}
