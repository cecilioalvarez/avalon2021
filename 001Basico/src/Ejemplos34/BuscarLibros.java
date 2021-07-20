package Ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BuscarLibros {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";

	public static void main(String[] args) {
		List<Libro> lista=buscarTodosLosLibros();
		for (Libro l: lista) {
			System.out.println("isbn: "+l.getIsbn()+ " || Titulo: " +l.getTitulo()+ " || Autor: "+l.getAutor());
			
		}
	}
	
	public static List<Libro> buscarTodosLosLibros() {
		List<Libro> libros=new ArrayList<Libro>();
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();
				ResultSet rs =sentencia.executeQuery("select * from libros");
				
				) {

				while (rs.next()) {
					
					Libro lib =new Libro(rs.getString("isbn"),rs.getString("titulo"),rs.getString("autor"));
					libros.add(lib);
					
				}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libros;
	}
	

}
