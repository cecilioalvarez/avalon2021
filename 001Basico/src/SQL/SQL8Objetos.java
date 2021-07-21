package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQL8Objetos {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "metrica123";
	// genero una consulta sql de inserción

	public static void main(String[] args) {

		Libro lib = new Libro("25", "java", "juan");
		// insertar(lib);
		String isbnAborrar = "25";
		//borrar(isbnAborrar);
		String isbnUpdate = "40";
		update(lib, isbnUpdate);

	}

	private static List<Libro> buscarTodosLosLibros() {

		final String CONSULTA = "select * from Libro";
		List<Libro> listaLibros = new ArrayList<Libro>();

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA);

		) {

			while (rs.next()) {

				// convirtiendo un resultset en una lista de objetos
				Libro l = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));
				listaLibros.add(l);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;

	}

	public static void insertar(Libro libro) {
		final String CONSULTA = "insert into Libro (isbn, titulo, autor) values (?,?,?)";

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA)) {

			sentencia.setString(1, libro.getIsbn());
			sentencia.setString(2, libro.getTitulo());
			sentencia.setString(3, libro.getAutor());
			sentencia.execute();

			System.out.println("LIBRO AÑADIDO CORRECTAMENTE");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void borrar(String isbn) {

		final String CONSULTA = "DELETE FROM `libro` WHERE `libro`.`isbn` =?";
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA)) {

			sentencia.setString(1, isbn);
			sentencia.execute();

			System.out.println("LIBRO BORRADO CORRECTAMENTE");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void update (Libro lib, String isbnOld) {
		final String CONSULTA = "UPDATE `libro` SET `isbn` = ? , `titulo` = ?, `autor` = ? WHERE `libro`.`isbn` = ?;";
		
		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA)) {

			sentencia.setString(1, lib.getIsbn());
			sentencia.setString(2, lib.getTitulo());
			sentencia.setString(3, lib.getAutor());
			sentencia.setString(4, isbnOld);
			sentencia.execute();

			System.out.println("LIBRO UPDATE CORRECTAMENTE");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
