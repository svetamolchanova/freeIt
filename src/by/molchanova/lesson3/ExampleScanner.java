package by.molchanova.lesson3;

import java.util.*;

public class ExampleScanner {

    public static void main(String[] args) {

//        //пример считывания целого числа
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a = scanner.nextInt();
//        System.out.println("Вы ввели "+a);

//        //пример считывания строки
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String str = sc.nextLine();
//        System.out.println("Вы ввели "+str);
//        System.out.println("Введите слово");
//        String str1 = sc.next();
//        System.out.println("Вы ввели "+str1);
//
        //проверка на наличие правильно введенного символа
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        if(scan.hasNextInt()){
            int x=scan.nextInt();
            System.out.println("Вы ввели "+x);
        }else{
            System.out.println("Вы ввели не целое число");
        }
    }
}
