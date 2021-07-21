package com.arquitecturajava.ejemplos35Cecilio;

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
	final static String CONSULTA_INSERTAR = "insert into Libro (isbn,titulo,autor) values (?,?,?)";
	final static String CONSULTA_BORRAR = "delete from Libro where isbn =?";
	final static String CONSULTA = "select * from Libro";
	final static String CONSULTA_BUSCAR_UNO = "select * from Libro where isbn=?";
	final static String CONSULTA_BUSCAR_UNO_TITULO = "select * from Libro where titulo=?";
	final static String CONSULTA_BUSCAR_UNO_AUTOR = "select * from Libro where autor=?";
	final static String CONSULTA_BUSCAR_TITULO_AUTOR = "select * from Libro where titulo =? and autor =?";
	final static String ACTUALIZA_DATO = "update Libro set titulo=?, autor =? where isbn =?";

	// private DataBaseHelper helper;
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
	
	public void actualizar() {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(ACTUALIZA_DATO);) {

			sentencia.setString(1, this.getTitulo());
			sentencia.setString(2, this.getAutor());
			sentencia.setString(3, this.getIsbn());
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
			e.printStackTrace();
		}

	}

	public static List<LibroAR> buscarTodos() {

		List<LibroAR> listaLibros = new ArrayList<LibroAR>();

		try (Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA);) {
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
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);){
				sentencia.setString(1, isbn);
				ResultSet rs = sentencia.executeQuery();
				rs.next();

				libro = new LibroAR(rs.getString("isbn"),rs.getString("titulo"), rs.getString("autor"));
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return libro;

	}
	
	public static LibroAR buscarUnoPorTitulo(String titulo) {

		LibroAR libro = null;
		
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO_TITULO);){
				sentencia.setString(1, titulo);
				ResultSet rs = sentencia.executeQuery();
				rs.next();

				libro = new LibroAR(rs.getString("isbn"),rs.getString("titulo"), rs.getString("autor"));
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return libro;

	}
	
	public static LibroAR buscarUnoPorAutor(String autor) {

		LibroAR libro = null;
		
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO_AUTOR);){
				sentencia.setString(1, autor);
				ResultSet rs = sentencia.executeQuery();
				rs.next();

				libro = new LibroAR(rs.getString("isbn"),rs.getString("titulo"), rs.getString("autor"));
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return libro;

	}
	
	public static List<LibroAR> buscarTodosTituloAutor(String titulo, String autor) {

		List<LibroAR> listaLibros = new ArrayList<LibroAR>();

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_TITULO_AUTOR);) {
				sentencia.setString(1, titulo);
				sentencia.setString(2, autor);
				
				ResultSet rs = sentencia.executeQuery();
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

}
