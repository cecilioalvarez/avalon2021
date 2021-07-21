package com.arquitecturajava.ejemplos35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.ejemplos34.Libro;



public class LibroAR {

	private String isbn;
	private String titulo;
	private String autor;
	
	final String CONSULTA_INSERTAR = "insert into Libros (isbn,titulo,autor) values (?,?,?)";
	final String CONSULTA_BORRAR = "delete from Libros  where isbn =?";
	
	private DataBaseHelper helper;
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
	public LibroAR(String isbn, String titulo, String autor,DataBaseHelper helper) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.helper=helper;
	}
	
	public LibroAR(String isbn,DataBaseHelper helper) {
		super();
		this.isbn = isbn;
		this.helper=helper;
	}
	public  void  insertar () {
		
			try (Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(), helper.getPassword());
					PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);
					) {

					sentencia.setString(1, this.getIsbn());
					sentencia.setString(2, this.getTitulo());
					sentencia.setString(3, this.getAutor());
					sentencia.execute();
				

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
	
	public  void  borrar () {

		
			try (Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(), helper.getPassword());
					PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {

					sentencia.setString(1, this.getIsbn());
					sentencia.execute();
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
	//porque vamos a buscar todos los libros
	//no tiene mucho sentido instanciar un libro
	//para luego más adelante buscar todos
	
	public  static  List<LibroAR>  buscarTodos() {
		
		
		 final String CONSULTA = "select * from Libros";
		 DataBaseHelper helper= new DataBaseHelper();
		 List<LibroAR> listaLibros= new ArrayList<LibroAR>();
		
		try (Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(), helper.getPassword());
				Statement sentencia = conn.createStatement();
				ResultSet rs =sentencia.executeQuery(CONSULTA);
				) {
				while (rs.next()) {
					
					LibroAR l= new LibroAR(rs.getString("isbn"),rs.getString("titulo"),rs.getString("autor"),helper);
					listaLibros.add(l);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaLibros;
		
	}
	
	
}
