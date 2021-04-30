package by.molchanova.lesson12.threads;

import java.util.concurrent.*;

public class CountDownExample {
    static final CountDownLatch countDown = new CountDownLatch(5);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    System.out.println("Thread #" + Thread.currentThread().getName() + " ready and waiting for countDown...");
                    countDown.await();
                    for (int j = 0; j < 5; j++){
                        System.out.println("Thread #" + Thread.currentThread().getName() + " working");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException ex){
                } finally {
                    System.out.println("Thread #" + Thread.currentThread().getName() + " finished...");
                }
            }).start();
        }
        final long count = countDown.getCount();
        for (int i = 0; i < count; i++) {
            operationEmulation(i);
        }
    }

    private static void operationEmulation(int i) throws InterruptedException {
        System.out.println("Long operation № " + i);
        Thread.sleep(1000);
        countDown.countDown();
        System.out.println("Long operation №" + i + " completed!!!");
    }
}
