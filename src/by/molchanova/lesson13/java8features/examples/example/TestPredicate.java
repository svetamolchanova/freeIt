package by.molchanova.lesson13.java8features.examples.example;

import java.util.*;
import java.util.function.*;

public class TestPredicate<Integer> implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        return Objects.nonNull(t);
    }
}
