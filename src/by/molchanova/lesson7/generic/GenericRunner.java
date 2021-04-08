package by.molchanova.lesson7.generic;

public class GenericRunner {
    public static void main(String[] args) {

        Generic<Double> name = new Generic<>(6.5);

        Generic<Integer> earthRadius = new Generic<>(6400);

        System.out.println(name.getGeneric());
        System.out.println(earthRadius.getGeneric());
    }
}
