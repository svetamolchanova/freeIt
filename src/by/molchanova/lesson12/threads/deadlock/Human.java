package by.molchanova.lesson12.threads.deadlock;

public class Human {

	public synchronized void checkHuman(Human obj) {
		try {
			System.out.println("From class ObjectOb checkHuman method. Thread: " + Thread.currentThread().getName());
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		obj.checkChecker(this);
	}

	public synchronized void checkChecker(Human obj) {
		System.out.println("From class ObjectA checkChecker method");
	}
}

