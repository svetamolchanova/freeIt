package by.molchanova.lesson8.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            User user = new User("Name " + i, "passport " + i, i);
            userSet.add(user);
            if (i == 3) {
                userSet.add(user);
            }
            System.out.println(user);
        }
        System.out.println(userSet);

//		for (User user: userSet) {
//		    if (user.getAge() == 3) {
//		        userSet.remove(user);
//            }
//        }

        Iterator iterator = userSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
