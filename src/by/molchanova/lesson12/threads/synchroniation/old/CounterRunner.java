package by.molchanova.lesson12.threads.synchroniation.old;

import java.util.concurrent.locks.*;

public class CounterRunner {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {

            Thread t = new Thread(() -> {
                //synchronized (counter) {
                try {
                    if (lock.isLocked()) {
                        System.out.println("Locked =(");
                    }
                    lock.lock();
                    counter.count = 1;
                    for (int j = 0; j < 5; j++) {
                        //synchronized (counter) {
                        System.out.printf("Thread %s modified counter. Current count = %d \n",
                                Thread.currentThread().getName(), counter.count);
                        counter.count++;
                        Thread.sleep(200);

                        //}
                    }
                } catch (Exception e) {
                } finally {
                    lock.unlock();
                }
                // }
            });
            t.setName("Thread " + i);
            t.start();

        }

    }
}
