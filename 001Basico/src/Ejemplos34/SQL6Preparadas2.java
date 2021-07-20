package Ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL6Preparadas2 {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	static final String CONSULTA = "insert into Personas (dni,nombre,edad) values (?,?,?)";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);) {

			sentencia.setInt(1, 5);
			sentencia.setString(2, "david");
			sentencia.setInt(3, 25);

			sentencia.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}