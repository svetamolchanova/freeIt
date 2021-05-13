package by.molchanova.lesson13.java8features.examples;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> stringOpt = Optional.of("Test");

        if (stringOpt.isPresent()) {
            System.out.println(stringOpt.get());
        } else {
            System.out.println("Nothing found string");
        }

        List<Integer> numbers = new ArrayList<>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min);

        min.ifPresent((o) -> System.out.println(o));

        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("Nothing found min value");
        }

    }
}



