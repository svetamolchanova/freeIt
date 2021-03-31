package by.molchanova.lesson2;

import java.util.*;

public class IfCondition {

    public static void main(String[] args) {
        int i;
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        if (i > 0)
            System.out.println("вы ввели положительное значение");
            //System.out.println("неверный блок");
        else {
            System.out.println("вы ввели отрицательное число");
        }
    }
}
