package by.molchanova.lesson12.threads.synchroniation.old;

public class ObjectToSynchronize {

	int count = 50;

	public synchronized void doWork() {
		//synchronized (ObjectToSynchronize.class) {
			int i = 0;
			while (i < 10) {
				try {
					System.out.println( count + " - Working with thread: " + Thread.currentThread().getName());
					Thread.sleep(200);
					count--;
					i++;
				} catch (InterruptedException e) {
					System.out.println("Thread was interrupted");
				}
			}
			System.out.println(Thread.currentThread().getName() + " finished!");
		//}
	}
}
