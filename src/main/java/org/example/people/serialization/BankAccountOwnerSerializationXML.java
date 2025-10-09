package org.example.people.serialization;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.people.serialization.BankAccountOwnerSerialization;
import org.example.people.serialization.BankAccountOwnerSerializationFactory;



import org.example.people.customers.Customer;

public class BankAccountOwnewrSerilizationXML implements BankAccountOwnerSerialization {
    BankAccountOwnerSerializationFactory factory = new BankAccountOwnerSerializationFactory();
    private final XmlMapper xmlMapper = new XmlMapper();

    @Override
    public String serialize(Object accountOwner){
        if (!(accountOwner instanceof Customer)){
            throw new IllegalArgumentException("Account owner type is not AccountOwner");
        }

        BankAccountOwnerSerialization accountOwnerSeriliaze = factory.createBankAccountOwnerSerialization((Customer) accountOwner);
        try {
            return xmlMapper.writeValueAsString(accountOwnerSeriliaze);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    @Override
    public String deserialize(String accountOwner)
    {


        return "";
    }
}
