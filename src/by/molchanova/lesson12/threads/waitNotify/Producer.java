package by.molchanova.lesson12.threads.waitNotify;

public class Producer implements Runnable {

    Store store;

    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
