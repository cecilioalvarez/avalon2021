package com.arquitecturajava.sql.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionSingleton {
    
    private static final DatabaseHelper DB_PROPERTIES = new DatabaseHelper();
    private static Connection conn;

    private static void createConnection() throws SQLException {
        DbConnectionSingleton.conn = DriverManager.getConnection(
                DB_PROPERTIES.getUrl(), 
                DB_PROPERTIES.getUser(), 
                DB_PROPERTIES.getPassword()
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