package ejercicio35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Libro {
	
	private String isbn;
	private String titulo;
	private String autor;
	private DataBaseHelper helper;
	
	final String CONSULTA_INSERTAR= "insert into libros (isbn,titulo,autor) values(?,?,?)";
	
	public Libro() {
		super();
	}

	public Libro(String isbn, String titulo, String autor,DataBaseHelper helper) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.helper=helper;
	}

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
	
	public void insertar() {
		

		try {
			Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(),helper.getPassword());
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);
			sentencia.setString(1, this.getIsbn());
			sentencia.setString(2, this.getTitulo());
			sentencia.setString(3, this.getAutor());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
