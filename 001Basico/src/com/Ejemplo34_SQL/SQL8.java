package Ejemplo34_SQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQL8 {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	static final String CONSULTA = "insert into Personas (dni,nombre,edad) values (?,?,?)";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);) {

			conn.setAutoCommit(false);

			try (PreparedStatement sentencia = conn.prepareStatement(CONSULTA)) {
				sentencia.setInt(1, 7);
				sentencia.setString(2, "gema");
				sentencia.setInt(3, 25);

				System.out.println("sigue");

				sentencia.execute();
				// cambio la parametrizacion para ejecutar con el mismo plan de ejecucion
				// una segunda consulta
				sentencia.setInt(1, 4);
				sentencia.setString(2, "marta");
				sentencia.setInt(3, 25);
				sentencia.execute();


			} catch (Exception ex) {

				ex.printStackTrace();
				conn.rollback();
			}

			conn.commit();

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}