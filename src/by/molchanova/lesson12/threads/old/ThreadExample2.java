package by.molchanova.lesson12.threads.old;

public class ThreadExample2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started...");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("working...");
                Thread.sleep(700);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished...");
    }

}
