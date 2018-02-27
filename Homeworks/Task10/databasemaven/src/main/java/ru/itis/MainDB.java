package ru.itis;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainDB {



    public static void main (String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/java_itis7");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        //dataSource.setDriverClassName("org.postgresql.Driver");

        HumanDataStorage storage = new HumanDataStorage(dataSource);
        //Human human = new Human("Иван Иванович", 48);

        //storage.save(human);


        Scanner scanner = new Scanner(System.in);
        int command = 0;
        while (true){
            System.out.println("МЕНЮ:");
            System.out.println("1. Добавить человека");
            System.out.println("2. Добавить автомобиль");
            System.out.println("3. Посмотреть всех человеков");
            System.out.println("4. Посмотреть все автомобили");
            System.out.println("5. Виход!!!11");

            command = scanner.nextInt();
            switch (command){
                case 1:{
                    System.out.println("Введите Имя и возраст:");
                    String name = scanner.next();
                    int age = scanner.nextInt();
                    Human human = new Human(name,age);
                    storage.save(human);

                }break;
                case 2:{}break;

                case 3:{

                }break;

                case 4:{}break;

                case 5:{
                    System.exit(0);
                }break;
            }
        }
    }
}
