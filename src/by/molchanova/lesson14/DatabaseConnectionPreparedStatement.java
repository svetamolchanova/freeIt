package by.molchanova.lesson14;

import java.sql.*;

public class DatabaseConnectionPreparedStatement {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/test?serverTimezone=Europe/Minsk&useSSL=false";
            //String url = "jdbc:mysql://localhost/test";
            String username = "root";
            String password = "root";
            try (Connection connection = DriverManager.getConnection(url, username, password)){

                String sql = "INSERT INTO customers (name, age) VALUES (?, ?)";
//
//                //System.out.println("Connection to Store DB succesfull!");
//
                Customer customer = new Customer("Michael", 45);
//
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
//                preparedStatement.setString(1, customer.getName());
//                preparedStatement.setInt(2, customer.getAge());
//
//                int rows = preparedStatement.executeUpdate();
//
//                System.out.printf("%d rows added", rows);

                String sql2 = "SELECT * FROM customers WHERE age < ?";

                int ageCondition = customer.getAge();
                preparedStatement = connection.prepareStatement(sql2);
                preparedStatement.setInt(1, ageCondition);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int age = resultSet.getInt("age");
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
