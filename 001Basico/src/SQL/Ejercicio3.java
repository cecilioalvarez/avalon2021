package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio3 {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "metrica123";
	// genero una consulta sql de inserción
	static final String CONSULTA = "SELECT * FROM `libro`";
	static final String QUERYINSERT = "INSERT INTO `libro` (`isbn`, `titulo`, `autor`) VALUES ('65465465465', 'agata', 'Gabrielaaa')";
	static final String QUERYUPDATE = "UPDATE `libro` SET `isbn` = 'CAMBIO', `titulo` = 'CAMBIO', `autor` = 'CAMBIO' WHERE `libro`.`isbn` = '2165465SAS'";
	static final String QUERYDELETE = "DELETE FROM `libro` WHERE `libro`.`isbn` = 'CAMBIO'";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);) {

			try  {
				PreparedStatement sentencia = conn.prepareStatement(CONSULTA);
				ResultSet rs = sentencia.executeQuery(CONSULTA);
				PreparedStatement sentenciaINSERT = conn.prepareStatement(QUERYINSERT);
				PreparedStatement sentenciaUPDATE = conn.prepareStatement(QUERYUPDATE);
				PreparedStatement sentenciaDELETE = conn.prepareStatement(QUERYDELETE);
				while (rs.next()) {

					// imprime las diferentes columnas por cada fila
					System.out.println(rs.getString("isbn"));
					System.out.println(rs.getString("titulo"));
					System.out.println(rs.getString("autor"));
				}
				sentencia.execute();
				//sentenciaINSERT.execute();
				//sentenciaUPDATE.execute();
				sentenciaDELETE.execute();
			} catch (Exception ex) {

				ex.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
