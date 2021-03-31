package by.molchanova.lesson4.animals;

public class Animal {

    private int size;
    private String color;
    private int age;

    public Animal(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("noting");
    }
}
