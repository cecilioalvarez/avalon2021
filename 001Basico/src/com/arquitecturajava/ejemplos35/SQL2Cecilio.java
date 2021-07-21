package com.arquitecturajava.ejemplos35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQL2Cecilio {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserciÃ³n

	public static void main(String[] args) {

		Libro l = new Libro("21", "bigDataSpark", "Jose");
		actualizar(l);

	}

	private static List<Libro> buscarTodosLosLibros() {

		final String CONSULTA = "select * from Libro";
		List<Libro> listaLibros = new ArrayList<Libro>();

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA);

		) {

			while (rs.next()) {

				// convirtiendo un resultset en una lista de objetos
				Libro l = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));
				listaLibros.add(l);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;

	}

	private static void insertar(Libro libro) {
		final String CONSULTA = "insert into Libro (isbn,titulo,autor) values (?,?,?)";

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);) {
			sentencia.setString(1, libro.getIsbn());
			sentencia.setString(2, libro.getTitulo());
			sentencia.setString(3, libro.getAutor());
			sentencia.execute();
			System.out.println("Libro añadido");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void borrar(Libro libro) {

		final String CONSULTA_BORRAR = "delete from Libro where isbn =?";
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {
			sentencia.setString(1, libro.getIsbn());
			sentencia.execute();
			System.out.println("Libro borrado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void actualizar(Libro libro) {

		final String ACTUALIZA_DATO = "update Libro set titulo=?, autor =? where isbn =?";
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(ACTUALIZA_DATO);) {

			sentencia.setString(1, libro.getTitulo());
			sentencia.setString(2, libro.getAutor());
			sentencia.setString(3, libro.getIsbn());
			sentencia.execute();
			System.out.println("Libro actualizado");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
