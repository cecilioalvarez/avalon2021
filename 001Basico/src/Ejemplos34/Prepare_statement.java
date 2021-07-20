package Ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepare_statement {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	static final String CONSULTA = "update personas set nombre='emilio' where dni='8756'";
	public static void main(String[] args) {
		try (Connection conn=DriverManager.getConnection(URL,USUARIO,CLAVE);
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);)
		{
			sentencia.setInt(1, 8);
			sentencia.setString(1, "gema");
			sentencia.setInt(3, 25);
			
			sentencia.execute();

			sentencia.setInt(1, 32);
			sentencia.setString(2, "marta");
			sentencia.setInt(3,25);

			sentencia.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
