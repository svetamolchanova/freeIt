package by.molchanova.lesson12.threads.executors;

import java.util.concurrent.*;

public class ScheduledExecutorExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

//        ExecutorService executor = Executors.newScheduledThreadPool(5);
//
//
//        Future<String> future = executor.submit(() -> {
//            Thread.sleep(2000);
//            return "Thread name = " + Thread.currentThread().getName();
//        });
//
//        System.out.println("future not done yet");


        ScheduledFuture<String> task = Executors.newScheduledThreadPool(5).schedule(
                () -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("In paralles thread: " + threadName);
                    Thread.sleep(1000);
                    return threadName;
                },
                5,
                TimeUnit.SECONDS);

        System.out.println(task.get() + " returned result!");
    }

}
