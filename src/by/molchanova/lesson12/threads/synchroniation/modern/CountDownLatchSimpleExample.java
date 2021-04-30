package by.molchanova.lesson12.threads.synchroniation.modern;

import java.util.concurrent.*;

public class CountDownLatchSimpleExample {

	private final static CountDownLatch countDown = new CountDownLatch(5);

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				try {
					System.out.println("Thread: " + Thread.currentThread().getName() + " started...");
					System.out.println("Thread: " + Thread.currentThread().getName() + " waitint for countdown...");
					countDown.await();
					System.out.println("Thread: " + Thread.currentThread().getName() + " finished...");
				} catch (InterruptedException e) {
				}
			}, "Thread " + i).start();

			Thread.sleep(700);
		}
		int count = (int) countDown.getCount();
//		Thread.sleep(3000);
		for (int i = 0; i <= count; i++) {
			beginCountingown();
		}
	}

	private static void beginCountingown() throws InterruptedException {
		System.out.println("Counting down...  " + countDown.getCount());
		Thread.sleep(900);
		countDown.countDown();
	}
}
