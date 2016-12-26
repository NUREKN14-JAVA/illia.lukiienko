package main.java.com.nure.lukienkoilya.db;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;

}