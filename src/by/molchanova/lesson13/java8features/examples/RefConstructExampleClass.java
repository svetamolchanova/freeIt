package by.molchanova.lesson13.java8features.examples;

public class RefConstructExampleClass {
    public static void main(String[] args) {
        EmptyCarBuilder ecb = Car::new;
        FulCarBuilder fcb = Car::new;

        Car car1 = ecb.buildCar();
        Car car2 = fcb.buildCar("Mazda", 1988);

        System.out.println(car1);
        System.out.println(car2);
    }
}

class Car {

    private String model;
    private int year;

    public Car() {
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + "]";
    }
}

interface EmptyCarBuilder {
    Car buildCar();
}

interface FulCarBuilder {
    Car buildCar(String model, int year);
}
