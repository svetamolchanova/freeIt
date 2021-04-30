package by.molchanova.lesson12;

public class Counter {
    public static int count = 0;
    public static String count2 = "Yohuuu";

    static Object o = new Object();

    public static void increment() {

        synchronized (o) {
            if (count % 100 == 0) {
                System.out.println(count2);
            }
            count++;

            System.out.println(count);
        }
    }

    public static void decrement() {

        synchronized (o) {
            if (count % 100 == 0) {
                System.out.println(count2);
            }
            count--;

            System.out.println(count);
        }
    }

}

