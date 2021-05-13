package by.molchanova.lesson13.java8features.examples;

import java.util.function.*;

public class StringTransformer implements Consumer<String> {

    @Override
    public void accept(String t) {
        String text = t.toUpperCase();
        StringBuilder sBuilder = new StringBuilder(text);
        sBuilder.reverse();
        String string = sBuilder.toString();
        printCheta(string);
    }

    public void printCheta(String text) {
        System.out.println(text);
    }

}
