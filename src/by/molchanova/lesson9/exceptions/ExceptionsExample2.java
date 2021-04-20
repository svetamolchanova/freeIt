package by.molchanova.lesson9.exceptions;

import java.io.*;

public class ExceptionsExample2 {
    public static void main(String[] args) throws ArithmeticException {
        int a = 5;
        int b = 0;
        try (FileInputStream in = new FileInputStream("src")) {
            int c = a/b;
            System.out.println("c: " + c);
        } catch (ArithmeticException e){
            System.out.println("result for b");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("result for a");
            System.out.println(e);
        }
        finally {
            System.out.println("a/b");
        }
        System.out.println("cccc");
    }
}
