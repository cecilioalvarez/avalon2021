package Ejemplo34_SQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL3 {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	static final String CONSULTA = "select * from Personas";

	public static void main(String[] args) {

		// hay dos objetos fundamentales para conectarnos a la base de datos
		// Connection: es una interfaz, por lo tanto debemos implementar las clses de sql para que implementen la interfaz
		// Statement: es una interfaz, por lo tanto debemos implementar las clses de sql para que implementen la interfaz
		//la interfaz de ResultSet: nos devuelve un grupo de datos(con esas filas de datos las recorremos y las traemos en pantalla

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();
				ResultSet rs =sentencia.executeQuery(CONSULTA);

				) {

				while (rs.next()) {

					//imprime las diferentes columnas por cada fila
					System.out.println(rs.getInt("dni"));
					System.out.println(rs.getString("nombre"));
					System.out.println(rs.getInt("edad"));
				}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}