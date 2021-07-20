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
		
		//String queryInsert= "INSERT INTO libro(isbn, titulo, autor) VALUES(?,?,?)";
		//String queryDelete= "DELETE FROM libro WHERE isbn=?";
		//String queryUpdate= "UPDATE libro set autor='Pedro' WHERE isbn=?";
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement sentencia = conn.createStatement();) {
			
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(queryInsert);){
				//PreparedStatement
				/*prepSentencia.setString(1, "A1");
				prepSentencia.setString(2, "Libro de David");
				prepSentencia.setString(3, "david");
				
				prepSentencia.execute();*/
				
			}catch (Exception ex) {
				ex.printStackTrace();
				conn.rollback();
			}
			conn.commit();
			
			myListaLibros = buscarTodosLibros();
			for (Libro libro : myListaLibros) {
				System.out.println(libro.getIsbn()+"-"+libro.getAutor()+"-"+libro.getTitulo());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	private static List<Libro>buscarTodosLibros(){
		String querySelect = "SELECT * FROM libro";
		List<Libro> listaLibros = new ArrayList<Libro>();
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement sentencia = conn.createStatement();) {
			//Para Resultados de SELECT
			ResultSet rs = sentencia.executeQuery(QUERY);
			
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
	
	public static void modifyBook() {
		
	}

}
