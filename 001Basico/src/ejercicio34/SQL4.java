package ejercicio34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQL4 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro = new Libro("12df", "pyton", "nose");
		insertarLibro(libro);
		
		libro.setTitulo("javascript");
		libro.setAutor("tampoco lo se");
		
		actualizarLibro(libro);
		//borrarLibro(libro);
		
		
		List<Libro> lista = buscarTodosLosLibros();
		for (Libro l : lista) {
			System.out.println(l.getIsbn());
			System.out.println(l.getTitulo());
			System.out.println(l.getAutor());

		}

	}

	private static List<Libro> buscarTodosLosLibros() {
		final String showQuery = "select * from libros";
		List<Libro> listaLibros = new ArrayList<Libro>();
		// MOSTRAR
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery(showQuery);
			while (rs.next()) {
				Libro l = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));
				listaLibros.add(l);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;

	}

	private static void insertarLibro(Libro libro) {
		final String insertQuery = "insert into libros (isbn,titulo,autor) values(?,?,?)";

		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement sentencia = conn.prepareStatement(insertQuery);
			sentencia.setString(1, libro.getIsbn());
			sentencia.setString(2, libro.getTitulo());
			sentencia.setString(3, libro.getAutor());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void borrarLibro(Libro libro) {
		final String deleteQuery = "delete from libros where isbn=?";

		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			PreparedStatement sentencia = conn.prepareStatement(deleteQuery);
			sentencia.setString(1, libro.getIsbn());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void actualizarLibro(Libro libro) {
		final String updateQuery="update libros set isbn=?, titulo=?, autor=? where isbn=?";
		
		// ACTUALIZAR
				try {
					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					try {

						// transaccional
						conn.setAutoCommit(false);
						PreparedStatement sentencia = conn.prepareStatement(updateQuery);
						sentencia.setString(1, libro.getIsbn());
						sentencia.setString(2, libro.getTitulo());
						sentencia.setString(3, libro.getAutor());
						sentencia.setString(4, libro.getIsbn());
						sentencia.execute();
						conn.commit();

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						conn.rollback();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
