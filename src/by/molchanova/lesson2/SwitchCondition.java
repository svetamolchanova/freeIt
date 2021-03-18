package by.molchanova.lesson2;

import java.util.*;

public class SwitchCondition {

    public static void main(String[] args) {
        int i;
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        String str;
        switch (i) {
            //case 5:
            case 6:
                System.out.println("Суббота");
                break;
            //case 6:
            case 7:
                System.out.println("*********");
                System.out.println("Воскресенье");
//            default:
//                System.out.println("Будний день");
        }
    }
}
