package ejercicio36;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CapituloRepository {
	

	private static DataBaseHelper helper = new DataBaseHelper();
	
	final static String CONSULTA_INSERTAR = "insert into capitulos (nombre,paginas,libros_isbn) values(?,?,?)";
	final static String CONSULTA_BORRAR = "delete from capitulos where nombre=?";
	final static String CONSULTA_BUSCAR_TODOS = "select * from capitulos";
	final static String CONSULTA_ACTUALIZAR = "update capitulos set nombre=?, paginas=?, libros_isbn=? where nombre=?";
	
	
	public void insertar(Capitulo capitulo) {

		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);
			sentencia.setString(1, capitulo.getNombre());
			sentencia.setInt(2, capitulo.getPaginas());
			sentencia.setString(3, capitulo.getLibros_isbn());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrar(Capitulo capitulo) {
		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_BORRAR);
			sentencia.setString(1, capitulo.getNombre());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Capitulo> buscarTodos() {

		List<Capitulo> listaCapitulos = new ArrayList<Capitulo>();

		try {
			Connection conn = helper.getConexion();
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery(CONSULTA_BUSCAR_TODOS);
			while (rs.next()) {
				Capitulo c = new Capitulo(rs.getString("nombre"), rs.getInt("paginas"), rs.getString("libros_isbn"));
				listaCapitulos.add(c);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaCapitulos;

	}

	public void actualizar(Capitulo capitulo) {

		try {
			Connection conn = helper.getConexion();
			PreparedStatement sentencia = conn.prepareStatement(CONSULTA_ACTUALIZAR);

			sentencia.setString(1, capitulo.getNombre());
			sentencia.setInt(2, capitulo.getPaginas());
			sentencia.setString(3, capitulo.getLibros_isbn());
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	

}
