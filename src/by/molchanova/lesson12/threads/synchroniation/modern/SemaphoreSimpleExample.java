package by.molchanova.lesson12.threads.synchroniation.modern;

import java.util.*;
import java.util.concurrent.*;

public class SemaphoreSimpleExample {

	private final static Semaphore SEMAPHORE = new Semaphore(3, true);

	public static void main(String[] args) throws InterruptedException {
		
		
		for (int i = 0; i <= 10; i++) {
			new Thread(() -> {
				try {
					SEMAPHORE.acquire();
					System.out.println("Thread: " + Thread.currentThread().getName() + " got into code after semaphore...");
					Thread.sleep(1000 + (100 + new Random().nextInt(901)));
					SEMAPHORE.release();
					System.out.println("Thread: " + Thread.currentThread().getName() + " released semaphore...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}).start();
			Thread.sleep(300);
		}
		
	}
}


