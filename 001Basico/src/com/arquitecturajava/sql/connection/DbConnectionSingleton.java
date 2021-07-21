package com.arquitecturajava.sql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionSingleton {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
    private static final String USER = "avalon";
    private static final String PASSWORD = "avalon";
    private static Connection conn;

    private static void createConnection() throws SQLException {
        DbConnectionSingleton.conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public static Connection getConnection() {
        try {
            if (DbConnectionSingleton.conn == null || DbConnectionSingleton.conn.isClosed()) {
                DbConnectionSingleton.createConnection();
            }
        } catch (SQLException ex) {
            System.err.println("Se ha producido un error al obtener la conexión con la BD.");
        }
        return DbConnectionSingleton.conn;
    }
}