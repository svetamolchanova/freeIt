package by.molchanova.lesson12.threads.synchroniation.modern;

public class MyThread implements Runnable {

	private static int threadNumber = 1;

	public String name;

	public MyThread() {
		this.name = "Thread " + threadNumber;
		MyThread.threadNumber++;
	}

	@Override
	public void run() {

		String oldNme = name;
		System.out.println("Поток " + name + " подошел к обменнику");
		try {
			this.name = ExchangerSimpleExample.EXCHANGER.exchange(this.name);
			System.out.println("Поток " + oldNme + " Теперь зовется " + name);
		} catch (InterruptedException e) {
		}

	}

}
