package com.arquitecturajava.sql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
    private static final String USER = "avalon";
    private static final String PASSWORD = "avalon";
    static Connection conn;

    private static void createConnection() {
        try {
            DbConnection.conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException sql_ex) {
            sql_ex.printStackTrace();
        }
    }
    
    public static Connection getConnection() {
        DbConnection.createConnection();
        return DbConnection.conn;
    }
}