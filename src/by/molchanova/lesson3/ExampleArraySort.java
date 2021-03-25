package by.molchanova.lesson3;

import by.molchanova.lesson1.*;
import java.util.*;

public class ExampleArraySort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Создаём объект типа Scanner
        Random r =new Random(); // Создаём объект типа Random
        System.out.println("Длина массива:");
        int n=sc.nextInt();// Вводим длину массива с клавиатуры
        System.out.println();
        Integer mass[]=new Integer[n]; // создаём одномерный массив длиной = n
        for(int i=0; i<n;i++){
            mass[i]=r.nextInt(9); // заполняем массив случайными числами от 0 до 9
        }
        System.out.println("Массив без изменений");
        for(int i=0; i<n;i++){
            System.out.print(mass[i]+" "); // выводим массив на экран
        }
        System.out.println();
        System.out.println();
        int min=mass[0];
        int max=mass[0];
        for(int i=0; i<mass.length; i++){
            if(mass[i]<min){ //находим min и max
                min=mass[i];
            }
            if(mass[i]>max){
                max=mass[i];
            }
        }
        System.out.println("max="+max+" min="+min);
        System.out.println();
        System.out.println("Сортировка пузырьком");
        for(int i=mass.length-1; i>0;i--){
            for(int j=0; j<i;j++){
                if(mass[j]<mass[j+1]){
                    int value=mass[j];
                    mass[j]=mass[j+1]; //сортировка массива пузырьком
                    mass[j+1]=value;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
//        for(int i=0; i<n;i++){
//            System.out.print(mass[i]+" ");
//        }
//        System.out.println();
//        System.out.println();
//        List<String> list = new ArrayList<>();
//        Arrays.sort(list.toArray());
//        System.out.println("Отсортированный по возрастанию");
//        for(int i=0; i<n;i++){ //автоматическая сортировка
//            System.out.print(mass[i]+" ");
//        }
//        System.out.println();
//        System.out.println();
//        Arrays.sort(mass, Collections.reverseOrder());
//        System.out.println("Отсортированный по убыванию"); //автоматическая сортировка
//        for(int i=0; i<n;i++){
//            System.out.print(mass[i]+" ");
//        }
        // A-Za-z
//        String[] str = {"Test", "Hello", "hello", "1111", "ttttt"};
//        //Arrays.sort(str);
//        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
//        System.out.println(Arrays.toString(str));
//        String[] str1 = Arrays.copyOfRange(str, 1, 3);
//        System.out.println(Arrays.toString(str1));

        //User[] users = new User[10];

//        String[] str = new String[5];
//        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
    }
}
