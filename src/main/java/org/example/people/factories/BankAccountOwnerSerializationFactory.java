package org.example.people.factories;

import org.example.people.Customer;
import org.example.people.serialization.BankAccountOwnerSerialization;

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
