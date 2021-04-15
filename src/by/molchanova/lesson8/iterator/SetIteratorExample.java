package by.molchanova.lesson8.iterator;

import by.molchanova.lesson8.collections.*;
import java.util.*;

public class SetIteratorExample {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            User user = new User("Name " + i, "passport " + i, i);
            userSet.add(user);
        }

        for (User user : userSet) {
            System.out.println(user);
        }

        System.out.println("-------------");

        Iterator iterator = userSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
