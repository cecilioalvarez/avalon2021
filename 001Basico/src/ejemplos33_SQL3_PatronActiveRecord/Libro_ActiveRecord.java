package ejemplos33_SQL3_PatronActiveRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Libro_ActiveRecord {
	private String isbn;
	private String autor;
	private String titulo;
	
	final String QUERYINSERT = "INSERT INTO libro(isbn, titulo, autor) VALUES(?,?,?)";
	private DataBaseHelper helper;
		
	public Libro_ActiveRecord(String isbn, String autor, String titulo,DataBaseHelper helper) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.helper=helper;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void addBook() {
		
		try(Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(),helper.getPass());){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYINSERT);){
				//PreparedStatement
			
				prepSentencia.setString(1, this.getIsbn());
				prepSentencia.setString(2, this.getTitulo());
				prepSentencia.setString(3, this.getAutor());
			
				prepSentencia.execute();
			}catch (Exception ex) {
				ex.printStackTrace();
				conn.rollback();
			}
			
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
