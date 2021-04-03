package by.molchanova.lesson4.animals;

import by.molchanova.lesson4.animals.*;

public class Cat extends Animal {

    String name;

    public Cat(String color) {
        super(color);
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
