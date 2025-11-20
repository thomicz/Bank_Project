package org.example.seriliatition;
import org.example.people.seriliazition.AccountOwnerSeriliazeFactory;
public interface Serializetion {
    public String serialize(Object object);
    public String deserialize(String object);
}
