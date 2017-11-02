package ru.itis;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/java_itis7";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);


        //Подключение к БД

        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();

        int command = 0;

        while (true){
            System.out.println("Меню:");
            System.out.println("1. Добавить пользователя");
            System.out.println("2. Добавить автомобиль");
            System.out.println("3. Посмотреть всех пользователей");
            System.out.println("4. Посмотреть все машины");
            System.out.println("5. Выход!");
            command = scanner.nextInt();
            switch (command){

                case 1: {
                    System.out.println("Введите имя:");
                    String name = scanner.next();
                    System.out.println("Введите возраст:");
                    int age = scanner.nextInt();
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "INSERT INTO owner(name, age) VALUES (?, ?)");
                    preparedStatement.setString(1, name);
                    preparedStatement.setInt(2, age);
                    preparedStatement.execute();
                } break;

                case 2: {
                    System.out.println("Введите марку автомобиля");
                    String model = scanner.next();
                    System.out.println("Введите цвет автомобиля");
                    String color = scanner.next();
                    System.out.println("Укажите id владельца");
                    int owner_id = scanner.nextInt();

                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "INSERT INTO car(model, color, owner_id) VALUES(?, ?, ?)");
                    preparedStatement.setString(1, model);
                    preparedStatement.setString(2, color);
                    preparedStatement.setInt(3, owner_id);
                    preparedStatement.execute();
                } break;

                case 3: {
                    PreparedStatement preparedStatement = connection.prepareStatement(
                                    "SELECT * FROM owner;");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()){
                        System.out.println(resultSet.getInt("id") + " " +
                                            resultSet.getString("name") + " " +
                                            resultSet.getInt("age"));
                    }

                } break;

                case 4: {
                    PreparedStatement preparedStatement = connection.prepareStatement(
                            "SELECT * FROM car;");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()){
                        System.out.println(resultSet.getString("model") + " " +
                                resultSet.getString("color") + " " +
                                resultSet.getInt("owner_id"));
                    }
                } break;

                case 5: {
                    System.exit(0);
                } break;
            }
        }



//        ResultSet resultSet = statement.executeQuery("SELECT * FROM owner;");
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt("id") + " " +
//                            resultSet.getString("name") + " " +
//                            resultSet.getString("age"));
//        }
    }
}
