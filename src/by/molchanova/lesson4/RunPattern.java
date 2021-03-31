package by.molchanova.lesson4;

import java.util.*;
import java.util.regex.*;

public class RunPattern {

    public static void main(String[] args) {

        String text = "+375-29";
        String patternText = ".\\d{3}-[0-9]{2,7}";
        String pattern = "[!?,.:;]";
        //System.out.println(text.matches(patternText));

//        Pattern regex = Pattern.compile(patternText);
//        Matcher matcher = regex.matcher(pattern);
//        //System.out.println(matcher.find());
//        while (matcher.find()) {
//            System.out.println(matcher.start() + " " + matcher.end());
//        }
//        System.out.println("+++++++++++++++");
//        matcher.reset();
//        matcher = regex.matcher(text);
//        while (matcher.find()) {
//            System.out.println(matcher.start() + " " + matcher.end());
//        }

        StringTokenizer string = new StringTokenizer(text);
        while (string.hasMoreElements()) {
            System.out.println(string.nextToken("-") + ", ");
        }
    }
}
