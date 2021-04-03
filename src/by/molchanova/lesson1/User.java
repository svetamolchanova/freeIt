package by.molchanova.lesson1;

import java.util.*;

public class User {

    public static String country = "BELARUS";

    public String name;
    public int id;
    public String lang;
    public Integer age;

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        String str = name;

        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
