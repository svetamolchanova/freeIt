package by.molchanova.lesson14;

import java.sql.*;
import java.util.*;

public class DatabaseConnectionResultSet {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/test";
            String username = "root";
            String password = "root";
            try (Connection connection = DriverManager.getConnection(url, username, password)){

                String sql = "SELECT * FROM customers;";

                //System.out.println("Connection to Store DB succesfull!");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                List<Customer> list = new ArrayList<>();
                Customer customer = null;
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int age = resultSet.getInt("age");
                    list.add(new Customer(name, age));
                    System.out.printf("Customer: id = %d , name = %s , age = %d\n", id, name, age);
                }
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}
