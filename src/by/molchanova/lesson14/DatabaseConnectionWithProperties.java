package by.molchanova.lesson14;

import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.util.*;

public class DatabaseConnectionWithProperties {

    public static void main(String[] args) {
        String sql = "CREATE TABLE employees (id INT PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR(20), last_name VARCHAR(20))";
        String sql2 = "CREATE TABLE stores (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), open_date date)";
        String sql3 = "DELETE FROM customers where age in (19, 31, 45)";
        try (Connection connection = getConnection()) {
            //System.out.println("Connection to Store DB succesfull!");

            //предназначен для выполнения простых SQL-запросов без параметров; содержит базовые методы для выполнения запросов и извлечения результатов
            Statement statement = connection.createStatement();

            // создание таблиц
            //executeUpdate - можем просмотреть сколько строк было добавлено, отредактировано, удалено
//                statement.executeUpdate(sql);
//                statement.executeUpdate(sql2);
//                System.out.println("Tables has been created!");

            //добавление данных
//                int rowsInsert = statement.executeUpdate("INSERT customers(name, age) VALUES ('Kate', 19)," +
//                        "('John', 45), ('Steven', 31)");
//                System.out.printf("Added %d rows", rowsInsert);

            //обновление данных
//                int rowsUpdate = statement.executeUpdate("UPDATE customers SET age = 35 where name = 'Tom'");
//                System.out.printf("Updated %d rows", rowsUpdate);

            //удаление данных
            int rowsDelete = statement.executeUpdate(sql3);
            System.out.printf("Deleted %d rows", rowsDelete);

        } catch (Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }

    public static Connection getConnection() throws SQLException, IOException {

        Properties props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("database.properties"))) {
            props.load(in);
        }
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");

        return DriverManager.getConnection(url, username, password);
    }
}
