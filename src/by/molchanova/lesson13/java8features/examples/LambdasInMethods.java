package by.molchanova.lesson13.java8features.examples;

import java.util.function.*;

public class LambdasInMethods {

    public static void main(String[] args) {

        Function<String, String> function = (string) -> {
            StringBuilder sb = new StringBuilder(string);
            sb.reverse();
            final String s = sb.toString();
            return s.toUpperCase();
        };

        Function<Integer, String> function1 = x ->  x.toString();

        System.out.println(function.apply("qqqq"));

        System.out.println(function1.apply(2));

//        Function<String, String> function = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//
//                StringBuilder sb = new StringBuilder(s);
//                sb.reverse();
//                final String str = sb.toString();
//                return str.toUpperCase();
//            }
//        };

//        String result = function.apply("NEW TEST STRING");
//        System.out.println(result);
//
//        myMethod("test string", function);
    }


    private static void myMethod(String string, Function<String, String> func) {
        System.out.println(func.apply(string));
    }

}
