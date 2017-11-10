package ru.itis;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainDB {
    public static void main (String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/java_itis7");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        //dataSource.setDriverClassName("org.postgresql.Driver");

        HumanDataStorage storage = new HumanDataStorage(dataSource);
        Human human = new Human("Иван Иванович", 48);

        storage.save(human);
    }
}
