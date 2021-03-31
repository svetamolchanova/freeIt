package by.molchanova.lesson4;

public class Boxing {

    public static void main(String[] args) {
        //Boxing
        //value assignment
        Integer value1 = new Integer(3); // < JDK 5
        Integer value2 = 5; //JDK 5 and >

        //argument in method
        int i = 4;
        printInteger(i);

        //Unboxing
        //value assignment
        int i1 = value1.intValue(); // < JDK 5
        int i2 = value2; //JDK 5 and >

        //in expressions with operators
        System.out.println(value1 > value2);

        //argument in method
        printInt(value1);
    }

    private static void printInteger(Integer i) {
        System.out.println(i);
    }

    private static void printInt(int i) {
        System.out.println(i);
    }

    /*
    byte -Byte
    char - Char
    int - Integer
    long - Long
    double - Double
    boolean - Boolean
     */
}
