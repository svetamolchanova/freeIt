package by.molchanova.lesson12.threads.synchroniation.modern;

import java.util.concurrent.*;

public class CyclicBarrierSimpleExmple {
	private static final CyclicBarrier BARRIER = new CyclicBarrier(4, () -> {
		try {
			System.out.println("All threads arrived...");
		} catch (Exception e) {
		}
	});

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 9; i++) {
			new Thread(() ->{
				try {
					System.out.println("Поток " + Thread.currentThread().getName() + " прибыл к барьеру");
					BARRIER.await();
					System.out.println("Поток " + Thread.currentThread().getName() + " завершился");
				} catch (InterruptedException | BrokenBarrierException e) {
				}
			}, "Поток " + i).start();
			Thread.sleep(400);
		}


	}
}

