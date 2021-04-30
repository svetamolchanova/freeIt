package by.molchanova.lesson12.threads.old;

public class ThreadExample1 extends Thread {
	
	int counter = 10;

    public ThreadExample1() {
    }

    public ThreadExample1(ThreadGroup group) {
	    super(group, "Thread-1");
    }

	@Override
	public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started...");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("working...");
                Thread.sleep(700);
            } catch (InterruptedException e) {
            }
        }
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished...");
	}
}
