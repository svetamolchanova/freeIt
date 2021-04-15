package by.molchanova.lesson8.collections.unmodif;

import by.molchanova.lesson8.collections.*;
import java.util.*;
import java.util.concurrent.*;

public class UnmodCollections {
    public static void main(String[] args) {
        List<User> usersList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User("Name " + i, "passport " + i, i);
            usersList.add(user);
        }

        System.out.println(usersList);
        System.out.println(usersList);
        System.out.println("-----------------");

        List<User> unmodUserList = Collections.unmodifiableList(usersList);

        List<User> concurCollection = new CopyOnWriteArrayList<>(usersList);

        final List<User> synchList = Collections.synchronizedList(usersList);

        System.out.println("-----------");

        System.out.println("concurCollection");
        concurCollection.remove(2);
        System.out.println(concurCollection);
        System.out.println(usersList);
//
//        System.out.println("-----------");
//
		System.out.println(unmodUserList);
        System.out.println(unmodUserList.get(1));
		unmodUserList.add(new User("test", "test", 100));
		unmodUserList.remove(3);
////
//        usersList.remove(0);
//        System.out.println(usersList);
//        System.out.println(synchList);
//        System.out.println(unmodUserList);
//
//        System.out.println("-----------");
//        System.out.println("concurCollection");
//		System.out.println(concurCollection);

//        boolean isUnmodifiable = Collections.unmodifiableList(usersList).getClass().isInstance(synchList);
//        System.out.println(isUnmodifiable);
    }
}
