package by.molchanova.lesson12;

import java.util.concurrent.*;

public class ThreadsExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program started!!!");
        System.out.println("Counter state: " + Counter.count);

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                Counter.increment();
                //yield();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                Counter.decrement();
            }
        }).start();


        System.out.println("Counter state: " + Counter.count);

    }
}



