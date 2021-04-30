package by.molchanova.lesson12.threads.waitNotify;

public class Consumer implements Runnable {

    Store store;
    private String name;

    Consumer(Store store, String name){
        this.store=store;
        this.name = name;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get(name);
        }
    }
}
