package main.java.com.nure.lukienkoilya.db;

import main.java.com.nure.lukienkoilya.User;

import java.util.Collection;

public class HsqldbUserDao implements UserDao {

    ConnectionFactory connectionFactory;

    public HsqldbUserDao(ConnectionFactory connectionFactory) {
        // TODO Auto-generated constructor stub
        this.connectionFactory = connectionFactory;
    }

    @Override
    public User create(User user) throws DatabaseException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(User user) throws DatabaseException {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(User user) throws DatabaseException {
        // TODO Auto-generated method stub

    }

    @Override
    public User find(Long id) throws DatabaseException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<?> findAll() throws DatabaseException {
        // TODO Auto-generated method stub
        return null;
    }
}