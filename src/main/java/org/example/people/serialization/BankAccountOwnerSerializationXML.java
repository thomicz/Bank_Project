package org.example.people.serialization;


public class BankAccountOwnewrSerilizationXML implements BankAccountOwnerSerialization {
    BankAccountOwnerSerializationFactory factory = new BankAccountOwnerSerializationFactory();
    private final XmlMapper xmlMapper = new XmlMapper();

    @Override
    public String serialize(Object accountOwner){
        if (!(accountOwner instanceof BaseHuman)){
            throw new IllegalArgumentException("Account owner type is not AccountOwner");
        }

        AccountOwnerSeriliaze accountOwnerSeriliaze = factory.createAccountOwnerSeriliaze((BaseHuman)accountOwner);
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
