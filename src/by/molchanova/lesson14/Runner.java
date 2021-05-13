package by.molchanova.lesson14;

public class Runner {

    public static void main(String[] args) {
        //java -classpath c:\Java\mysql-connector-java-8.0.11.jar;c:\Java Program
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Connection successful!");
        } catch (Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}
