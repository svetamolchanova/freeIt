package by.molchanova.lesson4.animals;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat("Black");
        cat.getColor();

        Dog dog = new Dog("White");
        dog.say();
        dog.getColor();
        dog.size = 6;
    }
}
