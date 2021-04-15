package by.molchanova.lesson8.collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("---------------  poll");
        Integer item = queue.poll();
        System.out.println(item);
        System.out.println("--------------");
        for (Integer i : queue) {
            System.out.println(i);
        }
        System.out.println("-------------- peek");
        Integer item2 = queue.peek();
        System.out.println(item2);
        System.out.println("--------------");
        for (Integer i : queue) {
            System.out.println(i);
        }
        System.out.println("--------------");


    }
}
