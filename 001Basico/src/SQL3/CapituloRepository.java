package SQL3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CapituloRepository {
	private static DataBaseHelper helper = new DataBaseHelper();

	final static String CONSULTA_INSERTAR = "insert into Capitulos (titulo,paginas) values (?,?)";
	final static String CONSULTA_BORRAR = "delete from capitulos where titulo =?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from capitulos";
	final static String CONSULTA_BUSCAR_UNO = "select * from capitulos where titulo=?";
	final static String CONSULTA_BUSCAR_TITULO_AUTOR = "select * from capitulos where titulo=? and libros_isbn=?";
	final static String CONSULTA_ACTUALIZAR = "update Capitulos set titulo=? where paginas=?";

	public void actualizar(Capitulo capitulo) {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);) {

			sentencia.setString(1, capitulo.getTitulo());
			sentencia.setInt(2, capitulo.getPaginas());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertar(Capitulo capitulo) {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setString(1, capitulo.getTitulo());
			sentencia.setInt(2, capitulo.getPaginas());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void borrar(Capitulo capitulo) {

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);) {
			sentencia.setString(1, capitulo.getTitulo());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// porque vamos a buscar todos los libros
	// no tiene mucho sentido instanciar un libro
	// para luego más adelante buscar todos

	public List<Capitulo> buscarTodos() {

		List<Capitulo> listaCapitulos = new ArrayList<Capitulo>();

		try (Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);) {
			while (rs.next()) {

				Capitulo cap = new Capitulo(rs.getString("titulo"), rs.getInt("paginas"), rs.getString("libros_isbn"));
				listaCapitulos.add(cap);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaCapitulos;

	}

	public List<Capitulo> buscarTituloyAutor(String titulo, String autor) {

		List<Capitulo> listaCapitulos = new ArrayList<Capitulo>();

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_TITULO_AUTOR);) {
			sentencia.setString(1, titulo);
			sentencia.setString(2, autor);

			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {

				Capitulo cap = new Capitulo(rs.getString("titulo"), rs.getInt("paginas"), rs.getString("libros_isbn"));
				listaCapitulos.add(cap);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaCapitulos;

	}

	public Capitulo buscarUno(String titulo) {

		Capitulo capitulo = null;

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);) {
			sentencia.setString(1, titulo);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			capitulo = new Capitulo(rs.getString("titulo"), rs.getInt("paginas"), rs.getString("libros_isbn"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return capitulo;

	}

}
