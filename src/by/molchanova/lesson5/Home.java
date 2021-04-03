package by.molchanova.lesson5;

import java.util.*;

import static by.molchanova.lesson5.Variables.*;
import static java.lang.Math.*;

public class Home {

    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println("++++++++++++");
        cat = null;
        Cat cat1 = new Cat();
        cat.findDish();

        int x = max(1, 5);
        long y = round(1.2);

        String season = SUMMER;
        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(Arrays.toString(Season.values()));
        int value = season1.ordinal();
        System.out.println(value);

//        Dog dog = null;
//        final int dogAge = 10;
//        dog = new Dog();
//        dog.age = 15;
//        dog.getSeasonWalk(Season.SUMMER);
//
//        if (dog.getSeason() == Season.WINTER) {
//            System.out.println("stay at home!");
//        }
//        int seasonNumber = dog.getSeason().getNumber();
//
//        System.out.println(Season.SUMMER.getNumber());
//
//        System.out.println(dog.getSeason());

//        System.out.println("****************");
//
//        Cat tom = new Cat("White", 3);
//        tom.setName("Tom");
//
//        Cat cat = new Cat("Black", 10);
//        cat.setName("Barsik");
//
//        Cat cat2 = new Cat();
//        cat2.setColor("Blue");
//        cat2.setAge(35);
//        cat2.setAge(5);
//
//        tom.run();
//
//        Random r = new Random();
//        int randomValue = r.nextInt(2);
//
//        Scanner scanner = new Scanner(System.in);
//        int scanValue = (scanner.nextInt());
//
//        cat2.speak("meow");
//        cat2.speak("Hello");

//        Animal animal = new Dog();
//
//        Dog dog1 = (Dog)animal;
//
//        //Cat cat = (Cat)animal;
//
//        if (animal instanceof Cat) {
//            System.out.println("cat");
//            Cat cat = (Cat)animal;
//        }
//
//        if (animal instanceof Dog) {
//            System.out.println("Dog");
//            Dog dog3 = (Dog) animal;
//        }
    }

    public void getAnimal(Dog animal) {
        System.out.println(animal.toString());
    }
}
