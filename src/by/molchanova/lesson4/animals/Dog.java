package by.molchanova.lesson4.animals;

public class Dog extends Animal{

    String gender;

    public Dog(String color) {
        super(color);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void say() {
        System.out.println("Wow");
    }
}
