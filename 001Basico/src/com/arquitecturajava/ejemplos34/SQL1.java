package com.arquitecturajava.ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL1 {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   static final String CONSULTA = "insert into Libro (isbn, titulo, autor) values ('81758698-5', 'El Valle caido','Laura Cabrera')";

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
			Statement sentencia = conn.createStatement();){
			sentencia.executeUpdate(CONSULTA);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
