package by.molchanova.lesson8.collections.unmodif;

import java.util.*;

public class ThreadSave {

    public static void main(String[] args) throws InterruptedException {

        List<String> syncCollection = Collections.synchronizedList(Arrays.asList("a", "b", "c", "d", "e", "f"));
        //List<String> syncCollection = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
        List<String> uppercasedCollection = new ArrayList<>();

        Runnable listOperations = () -> {
            //synchronized (syncCollection) {
            syncCollection.forEach((e) -> {
                uppercasedCollection.add(e.toUpperCase());
            });
           // }
        };


        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(uppercasedCollection);
    }
}
