package com.arquitecturajava.ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL5 {

	static final String URL = "jdbc:mysql://localhost:8889/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "root";
	// genero una consulta de actualización de registros 
	
	static final String CONSULTA = "update Personas set nombre='emilio' where dni=1";
	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();) {

			sentencia.executeUpdate(CONSULTA);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
