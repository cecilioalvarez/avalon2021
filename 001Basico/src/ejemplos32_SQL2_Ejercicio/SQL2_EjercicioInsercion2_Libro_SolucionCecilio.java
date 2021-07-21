package ejemplos32_SQL2_Ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQL2_EjercicioInsercion2_Libro_SolucionCecilio {
	
	   static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USER = "mavalon";
	   static final String PASS = "avalon2021";


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Libro> myListaLibros = new ArrayList<Libro>();
		
		Libro l1 = new Libro("A3", "aria", "Libro de Maria");
		
		addBook(l1);
			
		myListaLibros = buscarTodosLibros();
		for (Libro libro : myListaLibros) {
			System.out.println(libro.getIsbn()+"-"+libro.getAutor()+"-"+libro.getTitulo());
		}
		
		Libro lModificar = new Libro("A3", "Pedra", "Libro de Mar");
		modifyBook(lModificar);
		
		System.out.println("------------------------");
		myListaLibros = buscarTodosLibros();
		for (Libro libro : myListaLibros) {
			System.out.println(libro.getIsbn()+"-"+libro.getAutor()+"-"+libro.getTitulo());
		}
		
		removeBook("A3");
		
		System.out.println("------------------------");
		myListaLibros = buscarTodosLibros();
		for (Libro libro : myListaLibros) {
			System.out.println(libro.getIsbn()+"-"+libro.getAutor()+"-"+libro.getTitulo());
		}

	}
	
	private static List<Libro>buscarTodosLibros(){
		final String querySelect = "SELECT * FROM libro";
		List<Libro> listaLibros = new ArrayList<Libro>();
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement sentencia = conn.createStatement();) {
			//Para Resultados de SELECT
			ResultSet rs = sentencia.executeQuery(querySelect);
			
			while (rs.next()) {
				Libro l = new Libro(rs.getString("isbn"), rs.getString("autor"), rs.getString("titulo"));
				listaLibros.add(l);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaLibros;
	}
	
	private static void modifyBook(Libro libro) {
		String queryUpdate = "UPDATE libro set autor=?,titulo=? WHERE isbn=?";
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(queryUpdate);){
				//PreparedStatement
			
				prepSentencia.setString(1, libro.getAutor());
				prepSentencia.setString(2, libro.getTitulo());
				prepSentencia.setString(3, libro.getIsbn());
			
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
	
	private static void addBook(Libro libro) {
		final String queryInsert = "INSERT INTO libro(isbn, titulo, autor) VALUES(?,?,?)";
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(queryInsert);){
				//PreparedStatement
			
				prepSentencia.setString(1, libro.getIsbn());
				prepSentencia.setString(2, libro.getTitulo());
				prepSentencia.setString(3, libro.getAutor());
			
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

	private static void removeBook(String isbn) {
		final String queryDelete= "DELETE FROM libro WHERE isbn=?";
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);){
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(queryDelete);){
				//PreparedStatement
			
				prepSentencia.setString(1, isbn);
			
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
