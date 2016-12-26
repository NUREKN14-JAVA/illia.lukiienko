package main.java.com.nure.lukienkoilya.db;


import main.java.com.nure.lukienkoilya.User;

import java.util.Collection;

public interface UserDao {
    User create(User user) throws DatabaseException;

    void update(User user) throws DatabaseException;

    void delete(User user) throws DatabaseException;

    User find(Long id) throws DatabaseException;

    Collection findAll() throws DatabaseException;
}