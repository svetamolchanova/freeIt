package by.molchanova.lesson12.threads.executors;

import java.util.concurrent.*;

public class ExecutorsExample {
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);

		executor.submit(()->{
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " started");
			try {
				Thread.sleep(3200);
			} catch (InterruptedException e) {
				System.out.println("********Sleep state hd been interrupted!!!");
			}
		});
		
		Thread.sleep(100);
		try {
			System.out.println("Attempt to shut down executor...");
			executor.shutdown();
			executor.awaitTermination(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("********Task interrupted");
		}finally {
			if(!executor.isTerminated()) {
				System.out.println("Cancelling not finished tasks...");
			}
			executor.shutdownNow();
			System.out.println("Shutdown finished");
		}
		
		
	}
}
