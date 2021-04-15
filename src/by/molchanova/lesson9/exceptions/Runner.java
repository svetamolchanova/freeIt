package by.molchanova.lesson9.exceptions;

import by.molchanova.lesson8.collections.*;
import java.io.*;

public class Runner {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
//        UserData userData1 = new UserData(1, "name1");
//        UserData userData2 = new UserData(2, "name2");
        //try, catch, finally, throw, throws
        try (UserData userData1 = new UserData(1, "name1") ; UserData userData2 = new UserData(2, "name2")) {
//        try {
//            fis = new FileInputStream("text.txt");
            userData1.printName();
            userData2.printName();
            /*
            *
             */
            int i = 1/0;
            userData1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
