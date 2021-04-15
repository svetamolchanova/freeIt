package by.molchanova.lesson8.collections.unmodif;

import java.util.*;

public class Unmod {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        //unmodifiableList.add("four");
        list.add("four");
        System.out.println(unmodifiableList);
    }
}
