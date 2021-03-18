package by.molchanova.lesson1;

public class Person {

    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Перед break.");
                    if (t) {
                        break second;
                    }
                    System.out.println("Этот код не будет выполнен.");
                }
                System.out.println("Этот код не будет выполнен.");
            }
            System.out.println("После второго блока.");
        }
    }


}
