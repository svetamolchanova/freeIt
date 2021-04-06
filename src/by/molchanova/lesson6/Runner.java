package by.molchanova.lesson6;

import by.molchanova.lesson6.Math.*;

public class Runner {

    public static void main(String[] args) {
        Factorial factorial = Math.getFactorial(5);
        System.out.println("key: " + factorial.getKey());
        System.out.println("result: " + factorial.getResult());
    }
}
