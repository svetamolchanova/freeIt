package by.molchanova.lesson8.collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, User> nameUsermap = new HashMap<>();
        User spyUser = null;
        for (int i = 0; i < 5; i++) {
            User user = new User("Name " + i, "passport " + i, i);
            if (i == 3) {
                spyUser = user;
            }
            nameUsermap.put(user.passportNumber, user);
        }
        System.out.println("map");
        System.out.println(nameUsermap);

        spyUser.name = "SpyUser";
        nameUsermap.put(spyUser.passportNumber, spyUser);

        System.out.println(nameUsermap);

        System.out.println("-------------- key");

        Set<String> keys = nameUsermap.keySet();
        System.out.println(keys);

        System.out.println("-------------- values");

        Collection<User> values = nameUsermap.values();
        System.out.println(values);

        System.out.println("-------------iterator");

        Iterator mapIterator = nameUsermap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            System.out.println(mapIterator.next());
        }

    }
}
