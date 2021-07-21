package com.arquitecturajava.ejemplos35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL2 {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   static final String CONSULTA = "delete from Libro where titulo='El Valle caido'";
	   
	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();){
				sentencia.executeUpdate(CONSULTA);
			}catch(SQLException e) {
				e.printStackTrace();
			}

	}

}