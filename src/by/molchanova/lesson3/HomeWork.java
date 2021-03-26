package by.molchanova.lesson3;

import java.util.*;

public class HomeWork {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean b = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    b = true;
                    break;
                }
            }
            if (b) {
                System.out.println("есть повторения");
                break;
            }
        }
        if (!b) {
            System.out.println("повторений нет");
        }

        Random r = new Random();
        int[] numbers =
                {1, 2};
//                new int[r.nextInt(10) + 2];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        int i;
        for (int a = 0; a < numbers.length; a++) {
            for (i = a + 1; i < numbers.length; i++) {
                if (numbers[a] == numbers[i]) {
                    System.out.println("Элементы массива не различны");
                    break;
                }
            }
            if (i < numbers.length && numbers[i]==numbers[a]) {
                break;
            }
        }
    }
}
