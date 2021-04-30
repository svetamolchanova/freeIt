package by.molchanova.lesson12.threads.callablefuture;

import java.util.concurrent.*;

public class CallableFutureExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<String> task = ()->{
			int counter = 5;
			String threadName = Thread.currentThread().getName();
			while(counter > 0 ) {
				System.out.println("Still working...");
				Thread.sleep(700);
				counter--;
			}
			return threadName;
		};
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		Future<String> fut = ex.submit(task);
		
		System.out.println("Future isDone: "+fut.isDone());
		while (!fut.isDone()) {
			System.out.println("УЖЕ ПРИЕХАЛИ??");
			Thread.sleep(100);
		}
		System.out.println("Future isDone: "+fut.isDone());
		
		System.out.println("Future result: " + fut.get());
		
		ex.shutdown();
	}
}


