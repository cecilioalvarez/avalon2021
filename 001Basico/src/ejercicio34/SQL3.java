package ejercicio34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL3 {
	static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String updateQuery = "update libros set isbn=?, titulo=?, autor=? where isbn=?";
		String deleteQuery = "delete from libros where isbn=?";
		String insertQuery = "insert into libros (isbn,titulo,autor) values (?,?,?)";
		String showQuery = "select * from libros";

		// INSERTAR
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			try {

				// transaccional
				conn.setAutoCommit(false);
				PreparedStatement sentencia = conn.prepareStatement(insertQuery);
				sentencia.setString(1, "1sq");
				sentencia.setString(2, "spiderman");
				sentencia.setString(3, "stand lee");
				sentencia.execute();
				conn.commit();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// MOSTRAR
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery(showQuery);
			while (rs.next()) {
				System.out.println(rs.getString("isbn"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ELIMINAR
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			try {

				// transaccional
				conn.setAutoCommit(false);
				PreparedStatement sentencia = conn.prepareStatement(deleteQuery);
				sentencia.setString(1, "1sq");
				sentencia.execute();
				conn.commit();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ACTUALIZAR
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			try {

				// transaccional
				conn.setAutoCommit(false);
				PreparedStatement sentencia = conn.prepareStatement(updateQuery);
				sentencia.setString(1, "1sqtr");
				sentencia.setString(2, "lo que el viento");
				sentencia.setString(3, "tampoco lo se");
				sentencia.setString(4, "1sq");
				sentencia.execute();
				conn.commit();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
