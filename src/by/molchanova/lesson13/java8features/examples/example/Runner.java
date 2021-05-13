package by.molchanova.lesson13.java8features.examples.example;

import java.util.*;
import java.util.function.*;

public class Runner {

    public static void main(String[] args) {
        String str = "1";
        Integer i = null;
        Predicate testPredicate = new TestPredicate();
        System.out.println(testPredicate.test(i));

        Predicate<Integer> test = x -> Objects.nonNull(x);
        System.out.println(test.test(i));

        Predicate<String> test2 = x -> x.equals(str);
        test2.test("2");
    }
}
