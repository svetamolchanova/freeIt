package by.molchanova.lesson13.java8features.examples;

import java.util.function.*;

public class FunctionComposition {
    public static void main(String[] args) {

        Function<Integer, String> func = (s) -> Integer.toString(s).toUpperCase();


        String testString = "test string";

        String result = func
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply(123456);


        int testInt = 1234567;
        final String result2 = func
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply(testInt);


        System.out.println(testString);
        System.out.println(result);

        System.out.println("*************************");

        System.out.println(testInt);
        System.out.println(result2);


    }
}
