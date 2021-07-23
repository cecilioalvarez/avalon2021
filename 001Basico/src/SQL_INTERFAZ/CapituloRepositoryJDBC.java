package SQL_INTERFAZ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CapituloRepositoryJDBC  implements CapituloRepository{

	private static DataBaseHelper helper = new DataBaseHelper();

	final static String CONSULTA_INSERTAR = "insert into Capitulos (titulo,paginas, libros_isbn) values (?,?,?)";
	final static String CONSULTA_BORRAR = "delete from Capitulos  where titulo =?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from Capitulos";
	final static String CONSULTA_BUSCAR_UNO = "select * from Capitulos where titulo=?";
	final static String CONSULTA_ACTUALIZAR = "update Capitulos set paginas=?  where titulo=?";

	
	
	@Override
	public void actualizar(Capitulo capitulo) {
		
		
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);) {

			sentencia.setInt(1, capitulo.getPaginas());
			sentencia.setString(2, capitulo.getTitulo());
		
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public void insertar(Capitulo capitulo) {
		
		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);) {

			sentencia.setString(1, capitulo.getTitulo());
			sentencia.setInt(2, capitulo.getPaginas());
			sentencia.setString(3, capitulo.getLibro().getIsbn());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
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

	@Override
	public List<Capitulo> buscarTodos() {
		
		
		List<Capitulo> listaCapitulos = new ArrayList<Capitulo>();

		try (Connection conn = helper.getConexion();
				Statement sentencia = conn.createStatement();
				ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);) {
			while (rs.next()) {

				Capitulo c = new Capitulo(rs.getString("titulo"), rs.getInt("paginas"));
				listaCapitulos.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaCapitulos;

	}


	@Override
	public Capitulo buscarUno(String isbn) {
		
		Capitulo capitulo = null;

		try (Connection conn = helper.getConexion();
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BUSCAR_UNO);) {
			sentencia.setString(1, isbn);
			ResultSet rs = sentencia.executeQuery();
			rs.next();

			capitulo = new Capitulo(rs.getString("titulo"),rs.getInt("paginas"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return capitulo;
		
	}

}