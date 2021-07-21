package Ejemplo34_SQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQL6 {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
		static final String CONSULTA = "insert into Personas (dni,nombre,edad) values (?,?,?)";

	public static void main(String[] args) {

		// hay dos objetos fundamentales para conectarnos a la base de datos
		// Connection: es una interfaz, por lo tanto debemos implementar las clses de sql para que implementen la interfaz
		// Statement: es una interfaz, por lo tanto debemos implementar las clses de sql para que implementen la interfaz
		//la interfaz de ResultSet: nos devuelve un grupo de datos(con esas filas de datos las recorremos y las traemos en pantalla

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);) {

			sentencia.setInt(1, 5);
			sentencia.setString(2, "david");
			sentencia.setInt(3, 25);
			sentencia.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}