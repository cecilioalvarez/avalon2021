package com.arquitecturajava.sql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnectionSingleton {
    
    private static final Properties PROPERTIES = new DatabaseHelper().getProperties();
    private static Connection conn;

    private static void createConnection() throws SQLException {
        DbConnectionSingleton.conn = DriverManager.getConnection(
                PROPERTIES.getProperty("url"), 
                PROPERTIES.getProperty("user"), 
                PROPERTIES.getProperty("password")
        );
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