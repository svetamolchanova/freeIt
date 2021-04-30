package by.molchanova.lesson12.threads.deadlock;

public class DLRunner {

	public static void main(String[] args) throws InterruptedException {
		
		Human a = new Human();
		Human b = new Human();


		new Thread(() -> {
			a.checkHuman(b);
		}).start();


		new Thread(() -> {
			b.checkHuman(a);
		}).start();
	}

}
