package by.molchanova.lesson13.java8features.examples;

public class LambdaScopeExample {

    private static int x = 10;
    private static int y = 20;

    public static void main(String[] args) {

        int c = 50;
        int d = 40;

        Operation operation1 = () -> {
            x = 30;
            return x + y;
        };

        Operation operation = () -> x;

        System.out.println(operation1.calculate()); // 50
        System.out.println(x); // 30
        System.out.println("-----------------");

        Operation operation2 = () -> {
            //c = 100;
            return c * d;
        };

        //c = 100;

        System.out.println(operation2.calculate());
        System.out.println(c);

//        //error scope
//        String s1 = "Lambda";
//        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();


    }
}

@FunctionalInterface
interface Operation {
    int calculate();
}
