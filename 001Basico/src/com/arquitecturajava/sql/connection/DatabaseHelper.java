package com.arquitecturajava.sql.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class DatabaseHelper {

    private String url;
    private String user;
    private String password;
    private final Properties properties = new Properties();
    private static final String DEFAULT_PROPERTIES_FILE_PATH = ".\\databaseProperties\\avalonDb.properties";

    DatabaseHelper(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    DatabaseHelper(String propertiesFilePath) {
        try {
            this.properties.load(new FileInputStream(new File(propertiesFilePath)));
        } catch (FileNotFoundException fnf_ex) {
            System.err.println("Se ha producido un error al buscar el fichero de propiedades de la BD: " + fnf_ex.getMessage());
        } catch (IOException io_ex) {
            System.err.println("Se ha producido un error al leer el fichero de propiedades de la BD: " + io_ex.getMessage());
        }
    }

    DatabaseHelper() {
        try {
            this.properties.load(new FileInputStream(new File(DEFAULT_PROPERTIES_FILE_PATH)));
        } catch (FileNotFoundException fnf_ex) {
            System.err.println("Se ha producido un error al buscar el fichero de propiedades de la BD: " + fnf_ex.getMessage());
        } catch (IOException io_ex) {
            System.err.println("Se ha producido un error al leer el fichero de propiedades de la BD: " + io_ex.getMessage());
        }
    }
    
    Properties getProperties() {
        return this.properties;
    }
}