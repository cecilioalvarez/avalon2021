package ejemplos33_SQL3_PatronActiveRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Libro_ActiveRecord {
	private String isbn;
	private String autor;
	private String titulo;
	
	final static String QUERYINSERT = "INSERT INTO libro(isbn, titulo, autor) VALUES(?,?,?)";
	private static DataBaseHelper helper= new DataBaseHelper();
		
	public Libro_ActiveRecord(String isbn, String autor, String titulo) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
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
		
		try(Connection conn = helper.getConexion();){
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
	
	public void removeBook() {
		final String queryDelete= "DELETE FROM libro WHERE isbn=?";
		try(Connection conn = helper.getConexion();){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(queryDelete);){
				//PreparedStatement
			
				prepSentencia.setString(1, this.getIsbn());
			
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
	
	//estático porque voy a buscar todos los libros
	public static List<Libro_ActiveRecord>buscarTodosLibros(){
		final String querySelect = "SELECT * FROM libro";
		List<Libro_ActiveRecord> listaLibros = new ArrayList<Libro_ActiveRecord>();
		try(Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();) {
			//Para Resultados de SELECT
			ResultSet rs = sentencia.executeQuery(querySelect);
			
			while (rs.next()) {
				Libro_ActiveRecord l = new Libro_ActiveRecord(rs.getString("isbn"), rs.getString("autor"), rs.getString("titulo"));
				listaLibros.add(l);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaLibros;
	}
	
	public static Libro_ActiveRecord buscarLibro(String isbn){
		final String queryFind = "SELECT * FROM libro WHERE isbn=?";
		Libro_ActiveRecord libro = null;
		try(Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(queryFind);) {
			sentencia.setString(1, isbn);
			//Para Resultados de SELECT
			
			ResultSet rs = sentencia.executeQuery();
			if(rs.next()) {
				Libro_ActiveRecord l = new Libro_ActiveRecord(rs.getString("isbn"), rs.getString("autor"), rs.getString("titulo"));
				libro= l;
			}
				
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libro;
	}
	
	public static List<Libro_ActiveRecord> buscarLibroAutor(String autor){
		final String queryFindAutor = "SELECT * FROM libro WHERE autor=?";
		List<Libro_ActiveRecord> librosAutor = new ArrayList<Libro_ActiveRecord>();
		try(Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(queryFindAutor);) {
			sentencia.setString(1, autor);
			//Para Resultados de SELECT
			
			ResultSet rs = sentencia.executeQuery();
			while(rs.next()) {
				Libro_ActiveRecord l = new Libro_ActiveRecord(rs.getString("isbn"), rs.getString("autor"), rs.getString("titulo"));
				librosAutor.add(l);
			}
				
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return librosAutor;
	}
	
	public static List<Libro_ActiveRecord> buscarLibroTitulo(String titulo){
		final String queryFindTitulo = "SELECT * FROM libro WHERE titulo=?";
		List<Libro_ActiveRecord> librosAutor = new ArrayList<Libro_ActiveRecord>();
		try(Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(queryFindTitulo);) {
			sentencia.setString(1, titulo);
			//Para Resultados de SELECT
			
			ResultSet rs = sentencia.executeQuery();
			while(rs.next()) {
				Libro_ActiveRecord l = new Libro_ActiveRecord(rs.getString("isbn"), rs.getString("autor"), rs.getString("titulo"));
				librosAutor.add(l);
			}
				
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return librosAutor;
	}
	
	public static List<Libro_ActiveRecord> buscarLibroAutorTitulo(String autor,String titulo){
		final String queryFindTitulo = "SELECT * FROM libro WHERE autor=? and titulo=?";
		List<Libro_ActiveRecord> librosAutor = new ArrayList<Libro_ActiveRecord>();
		try(Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(queryFindTitulo);) {
			sentencia.setString(1, autor);
			sentencia.setString(2, titulo);
			//Para Resultados de SELECT
			
			ResultSet rs = sentencia.executeQuery();
			while(rs.next()) {
				Libro_ActiveRecord l = new Libro_ActiveRecord(rs.getString("isbn"), rs.getString("autor"), rs.getString("titulo"));
				librosAutor.add(l);
			}
				
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return librosAutor;
	}
	
	public void modifyBook(String field,String newData) {
		final String QUERYUPDATE = "UPDATE libro set "+field+"=? WHERE isbn=?";
		try(Connection conn = helper.getConexion();){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(QUERYUPDATE);){
				//PreparedStatement
			
				prepSentencia.setString(1, newData);
				prepSentencia.setString(2, this.getIsbn());
			
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

	@Override
	public String toString() {
		return "El libro con ISBN " + this.isbn + " es " + this.titulo + ", de " + this.autor + ".";
	}
	
	
	
	
}
