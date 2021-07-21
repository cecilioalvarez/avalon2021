package com.arquitecturajava.ejemplos35;

import java.util.Properties;

public class DataBaseHelper {

	private String url;
	private String user;
	private String password;
	Properties propiedades= new Properties();
	
	
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
	
	
	
}
