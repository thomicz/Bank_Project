package org.example.people.serialization;

import org.example.people.customers.Customer;

public class BankAccountOwnerSerializationFactory {

    BankAccountOwnerSerializationFactory factory = new BankAccountOwnerSerializationFactory();

    public BankAccountOwnerSerialization createBankAccountOwnerSerialization(Customer bankAccountOwner) {
        BankAccountOwnerSerialization  serialization = new BankAccountOwnerSerialization("", "", "");

        serialization.uuid = bankAccountOwner.getUuid();
        serialization.firstName = bankAccountOwner.getFirstName();
        serialization.lastName = bankAccountOwner.getLastName();

        return serialization;
    }


}
