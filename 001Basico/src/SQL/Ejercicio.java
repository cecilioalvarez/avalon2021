package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicio {
	static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USER = "root";
	static final String PASS = "metrica123";
	// static final String QUERY = "SELECT * FROM personas";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce los siguientes valores");
		System.out.println("DNI");
		String dni = in.next();
		System.out.println("NOMBRE");
		String nombre = in.next();
		System.out.println("EDAD");
		String edad = in.next();
		System.out.println(dni + nombre + edad);
		String QUERY = "INSERT INTO `personas` (`dni`, `nombre`, `edad`) VALUES ('" + dni + "' , '" + nombre + "' , '"
				+ edad + "')";
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = con.createStatement();
			System.out.println(QUERY);
			sentencia.executeUpdate(QUERY);

			/*
			 * 
			 * Consulta select
			 * 	ResultSet rs =sentencia.executeQuery(CONSULTA);
				
				) {

				while (rs.next()) {
					
					//imprime las diferentes columnas por cada fila
					System.out.println(rs.getInt("dni"));
					System.out.println(rs.getString("nombre"));
					System.out.println(rs.getInt("edad"));
				}	ResultSet rs =sentencia.executeQuery(CONSULTA);
				
				) {

				while (rs.next()) {
					
					//imprime las diferentes columnas por cada fila
					System.out.println(rs.getInt("dni"));
					System.out.println(rs.getString("nombre"));
					System.out.println(rs.getInt("edad"));
				}
			 */
			// sentencia.execute(QUERY);

			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
