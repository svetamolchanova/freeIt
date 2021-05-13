package by.molchanova.lesson13.java8features.examples;

import java.util.function.*;

public class PredicatesExample {
    public static void main(String[] args) {

        Predicate<String> stringExists = (s) -> s.length() > 0;

        System.out.println(stringExists.test("sfgsfg"));


    }
}
