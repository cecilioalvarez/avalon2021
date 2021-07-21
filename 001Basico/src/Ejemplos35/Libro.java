package Ejemplos35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	static final String CONSULTA_INSERTAR = "insert into Libros (isbn,titulo,autor) values (?,?,?)";
	static final String CONSULTA_BORRAR = "delete from Libros  where isbn =?";
	final static String CONSULTA_BUSCAR_UNO = "select * from libros where isbn=?";
	final static String CONSULTA_BUSCAR_UNO_TITULO = "select * from libros where titulo=?";
	final static String CONSULTA_BUSCAR_UNO_AUTOR= "select * from libros where autor=?";
	final static String CONSULTA_ACTUALIZAR = "update libros set titulo=? , autor=? where isbn=?";
	private static DataBaseHelper helper=new DataBaseHelper();

	public Libro(String isbn, String titulo, String autor, DataBaseHelper helper) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.helper = helper;
	}
	public Libro(String isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;

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

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setString(1, this.getTitulo());
			sentencia.setString(2, this.getAutor());
			sentencia.setString(3, this.getIsbn());
			sentencia.execute();
			System.out.println("Libro insertado");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void actualizar() {

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);) {

			sentencia.setString(1, this.getTitulo());
			sentencia.setString(2, this.getAutor());
			sentencia.setString(3, this.getIsbn());
			sentencia.execute();
			System.out.println(this.getTitulo());
			System.out.println(this.getAutor());
			System.out.println(this.getIsbn());
			System.out.println("Libro modificado");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static List<Libro> buscarTodos() {
		final String CONSULTA = "select * from Libros";
		DataBaseHelper helper = new DataBaseHelper();
		List<Libro> listaLibros = new ArrayList<Libro>();
		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA);) {
			while (rs.next()) {
				Libro l = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"), helper);
				listaLibros.add(l);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaLibros;
	}
	public static Libro buscarUno(String isbn) {

		Libro libro = null;
		//String consulta_buscar=CONSULTA_BUSCAR_UNO+"'"+isbn+"'";
		//System.out.println(consulta_buscar);
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);) {
			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			libro = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libro;
	}
	public static Libro buscarPorTitulo(String isbn) {

		Libro libro = null;
		//String consulta_buscar=CONSULTA_BUSCAR_UNO+"'"+isbn+"'";
		//System.out.println(consulta_buscar);
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO_TITULO);) {
			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			libro = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libro;
	}
	public static Libro buscarPorAutor(String isbn) {

		Libro libro = null;
		//String consulta_buscar=CONSULTA_BUSCAR_UNO+"'"+isbn+"'";
		//System.out.println(consulta_buscar);
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO_AUTOR);) {
			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			libro = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libro;
	}
	public  void  borrar () {
		try (Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {

				sentencia.setString(1, this.getIsbn());
				sentencia.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
