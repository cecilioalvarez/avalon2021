package com.arquitecturajava.ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL6Preparadas2 {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   static final String CONSULTA = "insert into Personas (dni, nombre, edad) values (?, ?,?)";

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA)){
			
			//transaccional
			conn.setAutoCommit(false);
			
			sentencia.setInt(1, 7);
			sentencia.setString(2, "gema");
			sentencia.setInt(3, 25);
			
			sentencia.execute();
			//cambio la ejecucion para ejecutar con el mismo plan de ejecucion
			//una segunda consulta
			sentencia.setInt(1, 4);
			sentencia.setString(2, "marta");
			sentencia.setInt(3, 25);
			
			sentencia.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
