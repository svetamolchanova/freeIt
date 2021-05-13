package by.molchanova.lesson13.java8features.fabriqueMethod;

import java.util.function.*;

public class CandyFactory {

    Supplier<Candy> chocolateCandySupplier = ChocolateCandy::new;
    Supplier<Candy> caramelCandySupplier = CaramelCandy::new;

    public Candy getCandy(int weight) {
        if (weight > 10) {
            return caramelCandySupplier.get();
        }
        return chocolateCandySupplier.get();
    }

}
