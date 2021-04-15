package by.molchanova.lesson9.exceptions;

import java.util.logging.*;

public class Example {

    private static Logger logger = Logger.getLogger(Example.class.getName());

    static void runException() {
        try {
            logger.info("run method run");
            throw new NullPointerException("example");
        } catch (NullPointerException e) {
            System.out.println("Exception in run");
            //System.err.println(e);
            //e.printStackTrace();
            logger.severe(e.toString());
            //throw e;
        }
    }

    public static void main(String[] args) {
        runException();
//        try {
//            runException();
//        } catch (NullPointerException e) {
//            System.out.println("main: " + e);
//        }
    }
}
