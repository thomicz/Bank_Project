package org.example.people;

public class StudentPerson extends BasePerson {
    String school;

    public StudentPerson(String uuid, String firstName, String lastName, String school) {
        super(uuid, firstName, lastName);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}
