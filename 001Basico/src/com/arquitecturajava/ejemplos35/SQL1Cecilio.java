package com.arquitecturajava.ejemplos35;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQL1Cecilio {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	

	public static void main(String[] args) {

		List<Libro> lista= buscarTodosLosLibros();
		
		for (Libro l: lista) {
			System.out.println(l.getIsbn());
			System.out.println(l.getTitulo());
			System.out.println(l.getAutor());
			
		}
		

	}
	
	private static  List<Libro>  buscarTodosLosLibros() {
		
		
		 final String CONSULTA = "select * from Libro";
		 List<Libro> listaLibros= new ArrayList<Libro>();
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();
				ResultSet rs =sentencia.executeQuery(CONSULTA);
				
				) {

				while (rs.next()) {
					
					//convirtiendo un resultset en una lista de objetos
					Libro l= new Libro(rs.getString("isbn"),rs.getString("titulo"),rs.getString("autor"));
					listaLibros.add(l);
				}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaLibros;
		
	}
	
}
