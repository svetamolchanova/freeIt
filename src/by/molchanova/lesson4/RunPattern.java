package by.molchanova.lesson4;

import java.util.*;
import java.util.regex.*;

public class RunPattern {

    public static void main(String[] args) {

        Student student = new Student();
        student.setEmail("svt@12www.com");

        validateEmail(student.getEmail());

//        while (matcher.find()) {
//            System.out.println(matcher.start() + " " + matcher.end());
//        }
//        System.out.println("+++++++++++++++");
//        matcher.reset();
//        matcher = regex.matcher(text);
//        while (matcher.find()) {
//            System.out.println(matcher.start() + " " + matcher.end());
//        }

//        StringTokenizer string = new StringTokenizer(text);
//        while (string.hasMoreElements()) {
//            System.out.println(string.nextToken("-") + ", ");
//        }
    }

    private static void validateEmail(String email) {
        String emailPattern = "\\w{3}@[a-zA-Z]+\\.[a-zA-Z]+";

        Pattern regex = Pattern.compile(emailPattern);
        Matcher matcher = regex.matcher(email);
        System.out.println(matcher.find());
    }
}
