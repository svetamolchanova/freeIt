package by.molchanova.lesson4.example;

public class Person implements Nameable{

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String name() {
        System.out.println(this.name);
        return this.name;
    }
}
