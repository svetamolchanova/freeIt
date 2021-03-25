package by.molchanova.lesson3;

import java.util.*;

public class ExampleArrays {

    public static void main(String[] args) {

//        Object[] strings = new Object[]{"hello", "test", "world"};
//
//        for (Object str: strings) {
//            String newSting = (String) str;
//            System.out.println(str.toString());
//        }
//   }


        int[] a = new int[5];

        for (int i : a) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("******************");

        Arrays.fill(a, 5);

        String[][] str = new String[3][3];
        //Arrays.fill(str, "Hello");
//        str[1] = "test";
//        System.out.println(Arrays.toString(str));
//        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        String[][] str1 = new String[3][3];
 //       Arrays.fill(str1, "Hello");
        System.out.println(Arrays.deepEquals(str, str1));
        System.out.println(Arrays.deepToString(str1));

//        //foreach
//        for(int i : a) {
//            System.out.print(i);
//        }
//
//        String[] str = new String[5];
//
//        Arrays.fill(str, "test");
//
//        str[1] = "new";
//
//        for (String string : str) {
//            System.out.println(string);
//        }

        int[] b = new int[5];

        Arrays.fill(b, 5);
        b[1] = 3;

 //       System.out.println(Arrays.equals(a, b));

        System.out.println(Arrays.toString(a));

        Arrays.asList(a);
    }
}
