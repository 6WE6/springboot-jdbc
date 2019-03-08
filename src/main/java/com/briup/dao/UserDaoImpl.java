package com.briup.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(long id,String name) {
        jdbcTemplate.update("insert into T_USER(ID,NAME) values(?, ?)", id, name);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from T_USER where NAME = ?", name);
    }

    @Override
    public int getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from T_USER", int.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from T_USER");
    }
}
