package by.molchanova.lesson8.collections;

import java.util.*;
import java.util.concurrent.*;

public class CopyOnWriteArrayListExample
{
    List<String> list;
    List<String> lst;
    public CopyOnWriteArrayListExample()
    {
        lst = new ArrayList<String>();
        lst.add("Java");
        lst.add("J2EE");
        lst.add("J2SE");
        lst.add("Collection");
        lst.add("Concurrent");

        list = new CopyOnWriteArrayList<>(lst);

        System.out.println("ЦИКЛ с изменением");
        printCollection(true);
        System.out.println("\nЦИКЛ без изменением");
        printCollection(false);
        System.out.println("--------------");
        System.out.println(lst);

    }
    private void printCollection(boolean change)
    {
        Iterator<String> iterator = lst.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.printf("  %s %n", element);
            if (change) {
                if (element.equals("Collection")) {
                    lst.add("Новая строка");
                    lst.remove(element);
                }
            }
        }
    }

    public static void main(String args[])
    {
        new CopyOnWriteArrayListExample();
        System.exit(0);
    }
}
