package by.molchanova.lesson12.threads.synchroniation.old;

import java.util.*;
import java.util.concurrent.*;

public class ThreadsSynchronizationExample {

    private static int priority = 10;
	
	public static void main(String[] args) throws InterruptedException {
	
		ObjectToSynchronize o = new ObjectToSynchronize();
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		List<Thread> threadList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			threadList.add(new Thread(() -> {
				o.doWork();
			}));
		}
		threadList.forEach(t -> t.setPriority(priority--));
		threadList.forEach((t) -> t.start());

		System.out.println("MyClass finished");
		
	}

}
