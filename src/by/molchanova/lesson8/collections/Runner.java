package by.molchanova.lesson8.collections;

import by.molchanova.lesson9.exceptions.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        User user = null;
        printUserName(user);
    }

    public static void printUserName(User user) {
        if (Objects.nonNull(user)) {
            System.out.println(user.getName());
        } else {
            try {
                throw new UserNotFoundException();
            } catch (UserNotFoundException e) {
                System.out.println("print");
                System.out.println(e.getMessage());
            }
        }
    }
}
