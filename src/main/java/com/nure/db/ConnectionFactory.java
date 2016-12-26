package main.java.com.nure.db;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection() throws DatabaseException;

}