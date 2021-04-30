package by.molchanova.lesson12.threads.synchroniation.modern;

import java.util.concurrent.*;

public class ExchangerSimpleExample {

	public static final Exchanger<String> EXCHANGER = new Exchanger<>();

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 6; i++) {

			new Thread(() -> {
				try {
					
					String myStringToExchange = "Thread " + Thread.currentThread().getName() + " personal Name";
					
					System.out.println("Thread " + Thread.currentThread().getName() + " started... And string to exchange = " + myStringToExchange);
					
					myStringToExchange = EXCHANGER.exchange(myStringToExchange);
					
					System.out.println("Thread " + Thread.currentThread().getName() + " ... And his string to exchange = " + myStringToExchange);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}, "Thread № " + i).start();
			Thread.sleep(1500);
			
//			Runnable r = new MyThread();
//
//			Thread t = new Thread(r);
//			t.start();
			
		}
	}
}
