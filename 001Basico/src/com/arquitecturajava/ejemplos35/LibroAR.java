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
	private static DataBaseHelper helper= new DataBaseHelper();
	
	final static  String CONSULTA_INSERTAR = "insert into Libros (isbn,titulo,autor) values (?,?,?)";
	final static String CONSULTA_BORRAR = "delete from Libros  where isbn =?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from Libros";
	

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
		
		
		 
		 
		 DataBaseHelper helper= new DataBaseHelper();
		 
		 List<LibroAR> listaLibros= new ArrayList<LibroAR>();
		
		try (Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(), helper.getPassword());
				Statement sentencia = conn.createStatement();
				ResultSet rs =sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);
				) {
				while (rs.next()) {
					
					LibroAR l= new LibroAR(rs.getString("isbn"),rs.getString("titulo"),rs.getString("autor"));
					listaLibros.add(l);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaLibros;
		
	}
	
	
}
