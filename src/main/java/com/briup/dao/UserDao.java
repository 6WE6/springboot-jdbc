package com.briup.dao;

public interface UserDao {
    void save(long id,String name);
    void deleteByName(String name);
    int getAllUsers();
    void deleteAllUsers();
}
