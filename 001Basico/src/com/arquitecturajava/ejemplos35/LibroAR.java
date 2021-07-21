package com.arquitecturajava.ejemplos35;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LibroAR {

	private String isbn;
	private String titulo;
	private String autor;

	private static DataBaseHelper helper = new DataBaseHelper();

	final static String CONSULTA_INSERTAR = "insert into Libros (isbn,titulo,autor) values (?,?,?)";
	final static String CONSULTA_BORRAR = "delete from Libros  where isbn =?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from Libros";
	final static String CONSULTA_BUSCAR_UNO = "select * from Libros where isbn=?";

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LibroAR(String isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;

	}

	public LibroAR(String isbn) {
		super();
		this.isbn = isbn;

	}

	public void insertar() {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setString(1, this.getIsbn());
			sentencia.setString(2, this.getTitulo());
			sentencia.setString(3, this.getAutor());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void borrar() {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {
			sentencia.setString(1, this.getIsbn());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// porque vamos a buscar todos los libros
	// no tiene mucho sentido instanciar un libro
	// para luego más adelante buscar todos

	public static List<LibroAR> buscarTodos() {

		List<LibroAR> listaLibros = new ArrayList<LibroAR>();

		try (Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);) {
			while (rs.next()) {

				LibroAR l = new LibroAR(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));
				listaLibros.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;

	}

	public static LibroAR buscarUno(String isbn) {

		LibroAR libro = null;

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);) {
			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			libro = new LibroAR(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return libro;

	}

	@Override
	public String toString() {
		return "LibroAR [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

}
