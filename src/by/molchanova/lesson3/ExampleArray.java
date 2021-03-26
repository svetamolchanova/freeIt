package by.molchanova.lesson3;

import java.util.*;

public class ExampleArray {

    public static void main(String[] args) {

        int[] i1 = {1, 3, 4, 5};
        int[] i2 = new int[5];
        for (int i = 0; i <= i1.length - 1; i++) {
            System.out.println(i1[i]);
        }
//
//        Random r = new Random();
//        for (int i = 0; i < i2.length; i++) {
//            i2[i] = r.nextInt(9);
//        }
//        System.out.println(Arrays.toString(i2));
//        String[] str = new String[6];
//        System.out.println(str.length);
//        System.out.println(Arrays.toString(str));

//        double d[] = new double[5];
//        d[0] = 1.0;
//
//        System.out.println(d[2]);
//        System.out.println(d.length);
//        System.out.println("********************");
//
//        int[] a = {1, 3, 4, 5, 6};
//        a[3] = 7;
//        System.out.println(Arrays.toString(a));
//        System.out.println(a[3]);
//        System.out.println("********************");
//
//        int[] b = new int[]{1, 2, 3, 4, 5};
//
//        int[][] a1 = new int[3][5];
//        String[][] str = {{"q", "hello"}, {"1", "ttt"}};

//
        System.out.println("Введите размерность массива NxM");
        Scanner sc = new Scanner(System.in); //создаём объект типа Scanner
        Random r = new Random(); // создаём объект типа Random
        int n = 0, m = 0; //объявление переменных
        if (sc.hasNextInt()) {
            n = sc.nextInt(); // вводим n с клавиатуры
            m = sc.nextInt(); // вводим m с клавиатуры
        }
        int mass[][] = new int[n][m]; //инициализация массива размером NxM
        for (int i = 0; i < n; i++) { //Заполнение массива случайными числами от 0 до 9
            for (int j = 0; j < m; j++) {
                mass[i][j] = r.nextInt(9);
                //System.out.print(mass[i][j] + " ");
            }
        }
//        System.out.println("количество строк: " + mass.length);
 //       System.out.println("количество столбцов: " + mass[n - 1].length);
        for (int i = 0; i < n; i++) {// вывод массива в консоль
            for (int j = 0; j < m; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
//
//        int max = 0;
//        //поиск максимального числа
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (mass[i][j] > max) {
//                    max = mass[i][j];
//                }
//            }
//        }
//        System.out.println("Максимальное значение " + max);
//
//        int min = 0;
//        //поиск минимального числа
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (mass[i][j] < min) {
//                    min = mass[i][j];
//                }
//            }
//        }
//        System.out.println("Минимальное значение " + min);
//
//        //зубчатый массив
//        int[][] nums = new int[3][];
//        nums[0] = new int[2];
//        nums[1] = new int[3];
//        nums[2] = new int[5];

    }
}
