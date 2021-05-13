package by.molchanova.lesson13.java8features.examples;

import java.util.*;
import java.util.concurrent.*;

public class ParallelStream {

    public static void main(String[] args) {
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        //parallel sort
//        long t02 = System.nanoTime();
////
////        long count2 = values.parallelStream().sorted().count();
////        System.out.println(count2);
////
////        long t12 = System.nanoTime();
////
////        long millis2 = TimeUnit.NANOSECONDS.toMillis(t12 - t02);
////        System.out.println(String.format("parallel sort took: %d ms", millis2));
////        System.out.println("---------------------");

        //sequential sort
        long t02 = System.nanoTime();

        long count2 = values.stream().sorted().count();
        System.out.println(count2);

        long t12 = System.nanoTime();

        long millis2 = TimeUnit.NANOSECONDS.toMillis(t12 - t02);
        System.out.println(String.format("parallel sort took: %d ms", millis2));


    }
}
