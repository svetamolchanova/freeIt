package by.molchanova.lesson2;

public class WhileExample {

    public static void main(String[] args) {
        int i =10;
        System.out.println(i);
        int age = 20;

        while (age < 30) {
//            System.out.println("меньше 30");
            age++;
        }

//        System.out.println(age);
//        System.out.println("********************");

        WhileExample whileExample = new WhileExample();
        whileExample.doWhileMethod(age);
        System.out.println(age);
    }

    public Integer doWhileMethod(int age) {
        do {
            System.out.println("возраст: " + age);
            age++;
        } while (age < 40);
        return age;
    }
}
