package org.example.people.serialization;

public class BankAccountOwnerSerialization {
    public String uuid;

    public String firstName;

    public String lastName;

    public BankAccountOwnerSerialization(String uuid, String firstName, String lastName) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUuid() {
        return uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
