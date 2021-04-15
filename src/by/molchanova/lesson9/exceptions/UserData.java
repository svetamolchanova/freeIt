package by.molchanova.lesson9.exceptions;

import java.io.*;

public class UserData implements Closeable {

    private int id;
    private String name;

    public UserData(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Create userdata: " + name);
    }

    @Override
    public void close() {
        System.out.println("Close user: " + name);
    }

    public void printName() {
        System.out.println(name);
    }
}
