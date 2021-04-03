package by.molchanova.lesson4.animals;

public class Animal {

    int size;
    private String color;
    private int age;
    private Body body;
    private Head head;

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

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Animal run away. Lose object");
    }
}
