package ru.itis;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HumanDataStorage implements RowMapper {
    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(name, age) VALUES (?, ?)";

    private JdbcTemplate jdbcTemplate;
    List<Human> result = jdbcTemplate.query("SELECT * FROM owner;", new RowMapper<Human>() {
        public Human mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Human(resultSet.getString("name"),resultSet.getInt("age"));
        }
    })

    public  HumanDataStorage(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public void save (Human human){
        jdbcTemplate.update(SQL_INSERT_USER, human.getName(),human.getAge());
    }


    public Human mapRow(ResultSet resultSet, int i) throws SQLException {
        return (Human) result;
    }


}
