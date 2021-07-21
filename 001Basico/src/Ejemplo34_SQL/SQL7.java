package Ejemplo34_SQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQL7 {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	static final String CONSULTA = "insert into Personas (dni,nombre,edad) values (?,?,?)";

	public static void main(String[] args) {

		// hay dos objetos fundamentales para conectarnos a la base de datos
		// Connection: es una interfaz, por lo tanto debemos implementar las clses de
		// sql para que implementen la interfaz
		// Statement: es una interfaz, por lo tanto debemos implementar las clses de sql
		// para que implementen la interfaz
		// la interfaz de ResultSet: nos devuelve un grupo de datos(con esas filas de
		// datos las recorremos y las traemos en pantalla

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);) {
			
			//transaccional
			//un autocommit lo que hace es que cada consulta se confirma, si una de ellas falla no confirma la que cumpla
			conn.setAutoCommit(false);

			sentencia.setInt(1, 7);
			sentencia.setString(2, "gema");
			sentencia.setInt(3, 25);
			sentencia.execute();
			
			System.out.println("sigue");
			
			//cambio de parametrizacion para que con el msimo plan de ejecicuion poder hacer una segunda consulta
			sentencia.setInt(1, 4);
			sentencia.setString(2, "marta");
			sentencia.setInt(3, 25);
			sentencia.execute();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}