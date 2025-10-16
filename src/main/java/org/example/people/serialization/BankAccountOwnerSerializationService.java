package org.example.people.serialization;

import com.google.gson.Gson;
import org.example.people.factories.BankAccountOwnerSerializationFactory;

public class BankAccountOwnerSerializationService {

    BankAccountOwnerSerializationFactory factory = new BankAccountOwnerSerializationFactory();
    Gson gson = new Gson();


}
