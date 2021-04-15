package by.molchanova.lesson8.collections;

import java.util.*;

public class ListExample {
    private static Random rand = new Random();

    public static void main(String[] args) {
        List<User> usersList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User("Name " + i, "" + rand.nextLong(), i);
            usersList.add(user);
//            if (i == 3) {
//                usersList.add(user);
//            }
        }
        User user = new User("Name " + 10, "" + rand.nextLong(), 10);
        //List<User> users = List.of(user);
        //users.add(user);
//        User user1 = users.get(0);
//        user.setName("Name 11");
//        System.out.println(users);

//        for (int i = 0; i < usersList.size(); i ++) {
//            User user = usersList.get(i);
//            if (i == 2) {
//                usersList.remove(user);
//            }
//            System.out.println(user);
//        }

//        for (User user : usersList) {
//            if (user.getAge() == 3) {
//                usersList.remove(3);
//            }
//        }
        System.out.println(usersList);
//        usersList.forEach(user -> System.out.println(user.getName()));
        //usersList.clear();

//        Iterator listIterator = usersList.iterator();
//        while (listIterator.hasNext()) {
//            User user = (User) listIterator.next();
//            if (user.getAge() == 3) {
//                listIterator.remove();
//            }
//        }
//        System.out.println(usersList);
//        List<User> users = usersList.subList(3,5);
//        System.out.println(users);
//        usersList.add(new User("Name " + 13, "" + rand.nextLong(), rand.nextInt(88) + 18));
//        System.out.println(usersList);


//        List<User> usersList2 = new LinkedList<>();
//        for (int i = 0; i < 3; i++) {
//            User user = new User("Name " + i, "" + rand.nextLong(), rand.nextInt(88) + 18);
//            usersList2.add(user);
//
//        }
//
//        printFirstElement(usersList);
//        System.out.println("-----------------");
//        printFirstElement(usersList2);

    }

    public static void printFirstElement(List<User> userList) {
        System.out.println(userList);
    }
}
