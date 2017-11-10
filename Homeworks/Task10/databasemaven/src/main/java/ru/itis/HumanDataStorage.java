package ru.itis;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class HumanDataStorage {
    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(name, age) VALUES (?, ?)";

    private JdbcTemplate jdbcTemplate;

    public  HumanDataStorage(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public void save (Human human){
        jdbcTemplate.update(SQL_INSERT_USER, human.getName(),human.getAge());
    }
}
