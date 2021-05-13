package by.molchanova.lesson13.java8features.examples;

import java.util.function.*;

public class SupplierConsumer {

    public static void main(String[] args) {

//		Supplier<Man> manSupplier = Man::new;
        Supplier<Man> manSupplier = () -> new Man();

        Man man = manSupplier.get();
        man.setName("Vasya");

//		Consumer<Man> manConsumer = System.out::println;
        Consumer<Man> manConsumer = (m) -> System.out.println(m);
        manConsumer.accept(man);

    }
}

class Man {
    private String name;

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man [name=" + name + "]";
    }

}
