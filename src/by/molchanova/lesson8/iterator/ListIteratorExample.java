package by.molchanova.lesson8.iterator;

import by.molchanova.lesson8.collections.*;
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User("Name " + i, "passport" + i, i);
            userList.add(user);
        }

        System.out.println(userList);
//		for (User user : userList)
//		{
//			if (user.getName().equals("Name 3"))
//			{
//				userList.remove(user);
//			}
//		}

        final Iterator<User> userIterator = userList.iterator();

        while (userIterator.hasNext()) {
            User user = userIterator.next();
            if (user.getName().equals("Name 3")) {
                userIterator.remove();
            }
        }

        System.out.println(userList);

    }
}
