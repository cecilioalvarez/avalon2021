package sql2;

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
	private static DataBaseHelper helper = new DataBaseHelper();

	final static String CONSULTA_INSERTAR = "insert into Libro (isbn,titulo,autor) values (?,?,?)";
	final static String CONSULTA_BORRAR = "delete from Libro  where isbn =?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from Libros";
	final static String CONSULTA_UPDATE = "UPDATE `libro` SET `isbn` = ?, `titulo` = ?, `autor` = ? WHERE `libro`.`isbn` = ?;";

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

	public Libro(String isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;

	}

	public Libro(String isbn) {
		super();
		this.isbn = isbn;

	}

	public void insertar() {

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
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

	public void update(String isbn) {

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_UPDATE);) {

			sentencia.setString(1, this.getIsbn());
			sentencia.setString(2, this.getTitulo());
			sentencia.setString(3, this.getAutor());
			sentencia.setString(4, isbn);

			sentencia.execute();
			System.out.println(CONSULTA_UPDATE);
			System.out.println("Actualizado correctamente");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Libro buscarPorTituloAutor(String titulo, String autor) {

		String CONSULTA_LibroAutor = "select * from libro where titulo=? AND autor=?";

		Libro libroBuscado = new Libro(null, null, null);

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_LibroAutor);) {
			sentencia.setString(1, titulo);
			sentencia.setString(2, autor);

			ResultSet rs = sentencia.executeQuery();

			while (rs.next()) {

				libroBuscado = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libroBuscado;

	}

	public Libro buscarPorTituloOAutor(String campo, String valor) {

		String CONSULTA_LibroAutor = "select * from libro where " + campo + "=?";

		Libro libroBuscado = new Libro(null, null, null);

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_LibroAutor);) {

			sentencia.setString(1, valor);

			ResultSet rs = sentencia.executeQuery();
			
			while (rs.next()) {

				libroBuscado = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libroBuscado;

	}

	public void borrar() {
		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
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

	public Libro buscarUno(String isbn) {

		String CONSULTA_LIBRO = "select * from libro where isbn=?";

		Libro libroBuscado = new Libro(null, null, null);

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_LIBRO);) {
			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();

			while (rs.next()) {

				libroBuscado = new Libro(rs.getString("isbn"), rs.getString("titulo"), rs.getString("autor"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libroBuscado;

	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

	public static List<Libro> buscarTodos() {
		DataBaseHelper helper = new DataBaseHelper();
		List<Libro> listaLibros = new ArrayList<Libro>();

		try (Connection conn = DriverManager.getConnection(helper.getUrl(), helper.getUser(), helper.getPassword());
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);) {
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

}