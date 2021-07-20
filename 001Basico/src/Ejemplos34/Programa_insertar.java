package Ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa_insertar {
	
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	
	public static void main(String[] args) {
		String dni="8765";
		String nombre="Manuel";
		String edad="34";
	
		//System.out.println(consulta1);
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement(); )
		{
				String consulta1="insert into Personas (dni,nombre,edad) values (" + dni + ",'" + nombre + "',"+ edad + ")";
				sentencia.executeUpdate(consulta1);
			System.out.println("Llego");
			//sentencia.executeUpdate(CONSULTA);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
