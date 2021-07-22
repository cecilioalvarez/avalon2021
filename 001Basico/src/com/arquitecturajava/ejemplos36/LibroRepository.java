package com.arquitecturajava.ejemplos36;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LibroRepository {

	private static DataBaseHelper helper = new DataBaseHelper();

	final static String CONSULTA_INSERTAR = "insert into Libros (isbn,titulo,autor) values (?,?,?)";
	final static String CONSULTA_BORRAR = "delete from Libros  where isbn =?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from Libros";
	final static String CONSULTA_BUSCAR_UNO = "select * from Libros where isbn=?";
	final static String CONSULTA_BUSCAR_TITULO_AUTOR = "select * from Libros where titulo=? and autor=?";
	final static String CONSULTA_ACTUALIZAR = "update Libros set titulo=? , autor=? where isbn=?";



	public void actualizar(Libro libro) {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);) {

			sentencia.setString(1, libro.getTitulo());
			sentencia.setString(2, libro.getAutor());
			sentencia.setString(3, libro.getIsbn());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertar() {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setString(1, this.getIsbn());
			sentencia.setString(2, this.getTitulo());
			sentencia.setString(3, this.getAutor());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void borrar() {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {
			sentencia.setString(1, this.getIsbn());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// porque vamos a buscar todos los libros
	// no tiene mucho sentido instanciar un libro
	// para luego más adelante buscar todos

	public static List<LibroRepository> buscarTodos() {

		List<LibroRepository> listaLibros = new ArrayList<LibroRepository>();

		try (Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);) {
			while (rs.next()) {

				LibroRepository l = new LibroRepository(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));
				listaLibros.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;

	}
	

	public static List<LibroRepository> buscarTituloyAutor(String titulo, String autor) {

		List<LibroRepository> listaLibros = new ArrayList<LibroRepository>();

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_TITULO_AUTOR);) {
			sentencia.setString(1, titulo);
			sentencia.setString(2, autor);

			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {

				LibroRepository l = new LibroRepository(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));
				listaLibros.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;

	}

	public static LibroRepository buscarUno(String isbn) {

		LibroRepository libro = null;

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);) {
			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			libro = new LibroRepository(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return libro;

	}

	@Override
	public String toString() {
		return "LibroAR [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

}
