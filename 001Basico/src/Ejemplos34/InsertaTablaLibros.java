package Ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertaTablaLibros {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	static final String CONSULTA ="insert into libros (isbn,titulo,autor) values (?,?,?)"; 
	//"CREATE TABLE libros (isbn varchar(255),titutlo varchar(255),autor varchar(255))";
//	static final String CONSULTA = "select * from personas";

	public static void main(String[] args) {
		
		Libro l1=new Libro("1111","Falco","Perez-Reverte");
		Libro l2=new Libro("222","Rebelion en la granja","Orwell");
		Libro l3=new Libro("3331","El Quijote","Cervantes");
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);) {
			
			sentencia.setString(1, l1.getIsbn());
			sentencia.setString(2, l1.getTitulo());
			sentencia.setString(3, l1.getAutor());
			sentencia.execute();
			sentencia.setString(1, l2.getIsbn());
			sentencia.setString(2, l2.getTitulo());
			sentencia.setString(3, l2.getAutor());
			sentencia.execute();
			sentencia.setString(1, l3.getIsbn());
			sentencia.setString(2, l3.getTitulo());
			sentencia.setString(3, l3.getAutor());
			sentencia.execute();
			System.out.println("paso1");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
