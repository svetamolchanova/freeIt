package by.molchanova.lesson5;

public class Dog extends Animal {

    public static final String KIND_DOG = "test dog";

    public Dog(String name, Season season) {
        super(name, 0, season);
    }

    public Dog() {
        this("dog", Season.SPRING);
    }

    @Override
    public String speak() {
        return "wow";
    }

    @Override
    public void run() {
        System.out.println("Dog runs");
    }
}
