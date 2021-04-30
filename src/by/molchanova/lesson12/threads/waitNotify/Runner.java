package by.molchanova.lesson12.threads.waitNotify;

public class Runner {

    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store, "Consumer");
        Consumer consumer2 = new Consumer(store, "Consumer2");
        new Thread(consumer2).start();
        new Thread(producer).start();
        new Thread(consumer).start();
    }

}
