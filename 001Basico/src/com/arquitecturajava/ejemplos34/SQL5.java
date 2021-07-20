package com.arquitecturajava.ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL5 {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   //Generamos una consulta de actualizacion de registros
	   static final String CONSULTA = "update personas set nombre='emilio' where dni=1";

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
			Statement sentencia = conn.createStatement();){
			sentencia.executeUpdate(CONSULTA);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
