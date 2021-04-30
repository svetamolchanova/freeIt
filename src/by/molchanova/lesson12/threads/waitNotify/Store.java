package by.molchanova.lesson12.threads.waitNotify;

public class Store {

    private int product=0;
    public synchronized void get(String name) {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Покупатель " + name + " купил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notifyAll();
    }
    public synchronized void put() {
        while (product>=6) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notifyAll();
    }

}
