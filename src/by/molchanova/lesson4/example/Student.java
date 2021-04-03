package by.molchanova.lesson4.example;

public class Student implements Nameable{

    private int id;
    private String name;
    private Person person;

    @Override
    public String name() {
        return this.person.getName();
    }
}
