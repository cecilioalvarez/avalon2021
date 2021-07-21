package Ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModificarLibro {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta de actualización de registros 
	
	//static final String CONSULTA = "update libros set titulo='Falcó' where isbn='1111'";
	public static void main(String[] args) {
		
		Libro l1=new Libro("1111","Falcó","Perez-Reverte");
		String CONSULTA="update libros set titulo='"+l1.getTitulo()+"' where isbn='"+l1.getIsbn()+"'";
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();) {
			System.out.println(CONSULTA);
			//sentencia.executeUpdate(CONSULTA);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}