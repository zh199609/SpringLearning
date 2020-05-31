package com.zl.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "INSERT INTO `zl`.`user`(`username`) VALUES (?);";
        String s = UUID.randomUUID().toString();
        jdbcTemplate.update(sql, s);
    }
}
