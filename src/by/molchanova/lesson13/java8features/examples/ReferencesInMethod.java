package by.molchanova.lesson13.java8features.examples;

import java.util.function.*;

public class ReferencesInMethod {


    @SuppressWarnings("unused")
    public static void main(String[] args) {

        ReferencesInMethod ref = new ReferencesInMethod();

        myMethod("text 1", (s) -> {
            s.toUpperCase();
            System.out.println(s);
        });

        myMethod("test text", System.out::println);

        String text = "text example";

        Consumer<String> transformer = System.out::println;

        Consumer<Integer> tr = (o) -> System.out.println(o);


        Consumer<String> transformator3 = (o) -> System.out.println(o);


        Consumer<String> transformator2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };


        myMethod(text, transformer);

//		myMethod(text, cons);
//		myMethod(text, cons::accept);
//		myMethod(text, StringTransformer::doSmth);

    }

    public void getInfo() {
        System.out.println("test");
    }

    private static void myMethod(String text, Consumer<String> consumer) {
        consumer.accept(text);
    }

}

