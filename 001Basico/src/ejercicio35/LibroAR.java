package ejercicio35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LibroAR {

	private String isbn;
	private String titulo;
	private String autor;
	private static DataBaseHelper helper = new DataBaseHelper();

	final static String CONSULTA_INSERTAR = "insert into libros (isbn,titulo,autor) values(?,?,?)";
	final static String CONSULTA_BORRAR = "delete from libros where isbn=?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from libros";
	final static String CONSULTA_BUSCAR_UNO = "select * from libros where isbn=?";
	final static String CONSULTA_ACTUALIZAR = "update libros set isbn=?, titulo=?, autor=? where isbn=?";
	final static String CONSULTA_BUSCAR_TITULO = "select * from libros where titulo=?";
	final static String CONSULTA_BUSCAR_TITULO_AUTOR = "select * from libros where titulo=? AND autor=?";

	public LibroAR() {
		super();
	}

	public LibroAR(String isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.helper = new DataBaseHelper();
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
			Connection conn = helper.getConexion();
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

	public void borrar() {
		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);
			sentencia.setString(1, this.getIsbn());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<LibroAR> buscarTodos() {

		List<LibroAR> listaLibros = new ArrayList<LibroAR>();

		try {
			Connection conn = helper.getConexion();
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);
			while (rs.next()) {
				LibroAR l = new LibroAR(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));
				listaLibros.add(l);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaLibros;

	}

	public static LibroAR buscarUno(String isbn) {
		LibroAR l = new LibroAR();
		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);

			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();
			rs.next();
			l.setIsbn(rs.getString("isbn"));
			l.setTitulo(rs.getString("titulo"));
			l.setAutor(rs.getString("autor"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	public void actualizar() {

		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);

			sentencia.setString(1, this.getTitulo());
			sentencia.setString(2, this.getAutor());
			sentencia.setString(3, this.getIsbn());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public LibroAR buscarPorTitulo(String titulo) {

		LibroAR l = new LibroAR();
		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_TITULO);

			sentencia.setString(1, titulo);
			ResultSet rs = sentencia.executeQuery();
			rs.next();
			l.setIsbn(rs.getString("isbn"));
			l.setTitulo(rs.getString("titulo"));
			l.setAutor(rs.getString("autor"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}

	public LibroAR buscarPorAutor(String autor) {

		LibroAR l = new LibroAR();
		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_TITULO);

			sentencia.setString(1, autor);
			ResultSet rs = sentencia.executeQuery();
			rs.next();
			l.setIsbn(rs.getString("isbn"));
			l.setTitulo(rs.getString("titulo"));
			l.setAutor(rs.getString("autor"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return l;
	}
	
	public static List<LibroAR> buscarPorIituloAutor(String titulo,String autor) {

		List<LibroAR> lista=new ArrayList<LibroAR>();
		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_TITULO_AUTOR);

			sentencia.setString(1, titulo);
			sentencia.setString(2, autor);
			ResultSet rs = sentencia.executeQuery();
			rs.next();
			LibroAR l=new LibroAR(rs.getString("isbn"),rs.getString("titulo"),rs.getString("autor"));
			lista.add(l);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}

}
