package Ejemplo36C_Telefono;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBaseHelper {

	private String url;
	private String user;
	private String password;
	private Properties propiedades = new Properties();

	public DataBaseHelper(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConexion() throws SQLException {
		return DriverManager.getConnection(getUrl(), getUser(), getPassword());
	}

	public DataBaseHelper() {
		try {
			propiedades.load(new FileInputStream(new File("./database/database.properties")));
			url = propiedades.getProperty("url");
			user = propiedades.getProperty("user");
			password = propiedades.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}