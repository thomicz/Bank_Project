package org.example.seriliatition;
import org.example.people.AccountOwner;
import org.example.people.BaseHuman;
import org.example.people.seriliazition.AccountOwnerSeriliaze;
import org.example.people.seriliazition.AccountOwnerSeriliazeFactory;
import org.example.seriliatition.Serializetion;
public class AccountOwnerJsonSeriliazeService implements Serializetion {
    AccountOwnerSeriliazeFactory factory = new AccountOwnerSeriliazeFactory();

    @Override
    public String serialize(Object accountOwner){
        if (!(accountOwner instanceof BaseHuman)){
            throw new IllegalArgumentException("Account owner type is not AccountOwner");
        }
        AccountOwnerSeriliaze accountOwnerSeriliaze = factory.createAccountOwnerSeriliaze((BaseHuman)accountOwner);
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append("\"uuid\":\"").append(accountOwnerSeriliaze.uuid).append("\",");
        builder.append("\"lastName\":\"").append(accountOwnerSeriliaze.lastName).append("\",");
        builder.append("\"firstName\":\"").append(accountOwnerSeriliaze.firstName).append("\"");
        builder.append("}");
        return builder.toString();
    }
    @Override
    public String deserialize(String accountOwner)
    {


        return "";
    }

}
