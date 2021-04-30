package by.molchanova.lesson12.threads.old;

public class ThreadRunner {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Thread " + Thread.currentThread().getName() + " started...");

//		new Thread(() -> {
//			System.out.println("Thread " + Thread.currentThread().getName() + " started...");
//			for (int i = 0; i < 10; i++) {
//				try {
//					System.out.println("working...");
//					Thread.sleep(700);
//				} catch (InterruptedException e) {
//				}
//			}
////			try {
////                Thread.currentThread().join();
////            } catch (InterruptedException e) {
////			    e.printStackTrace();
////            }
//			System.out.println("Thread " + Thread.currentThread().getName() + " finished...");
//		}, "new parallel thread").start();











//        ThreadGroup group = new ThreadGroup("Thread group 1");
//        ThreadExample1 thread = new ThreadExample1(group);
//        thread.setDaemon(true);
//        System.out.println(thread.getThreadGroup().getName());
//
//        Thread thread = new ThreadExample1();
//        //thread.setDaemon(true);
//        thread.start();

////
        ThreadExample2 threadExample2 = new ThreadExample2();
        Thread thread2 = new Thread(threadExample2);
        thread2.start();
//        thread2.join(2000);
        Thread.yield();

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Current thread: " + Thread.currentThread().getName());
//                System.out.println("Hello");
//            }
//        });
//        thread.run();
//        thread.interrupt();

		System.out.println("Thread " + Thread.currentThread().getName() + " finished...");
	}
}
