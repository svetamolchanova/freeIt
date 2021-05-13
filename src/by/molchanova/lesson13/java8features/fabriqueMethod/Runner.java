package by.molchanova.lesson13.java8features.fabriqueMethod;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Candy> candyList = new ArrayList<>();
        CandyFactory factory = new CandyFactory();

        for (int i = 0; i < 50; i++) {
            candyList.add(factory.getCandy(2 + new Random().nextInt(20)));
        }

        candyList.stream().forEach((c) -> System.out.println(c));

    }
}
