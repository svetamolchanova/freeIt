package by.molchanova.lesson13.java8features.examples.car;

import java.util.function.*;

public class CarRunner {
    public static void main(String[] args) {

        Supplier<Car> carSupplier = Car::new;
        Consumer<Car> carConsumer = (c) -> System.out.println("Car is audi: " + c.getModel().equalsIgnoreCase("audi"));


        Car c1 = carSupplier.get();
        c1.setModel("Audi");
        Car c2 = carSupplier.get();
        c2.setModel("BMW");
        Car c3 = carSupplier.get();
        c3.setModel("NISSAN");
        Car c4 = carSupplier.get();
        c4.setModel("OPEL");

        carConsumer.accept(c1);
        carConsumer.accept(c2);
        carConsumer.accept(c3);
        carConsumer.accept(c4);

    }
}



