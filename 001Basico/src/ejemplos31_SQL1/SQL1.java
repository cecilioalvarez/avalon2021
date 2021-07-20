package ejemplos31_SQL1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL1 {
	
	   static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	   /*static final String USER = "mavalon";
	   static final String PASS = "avalon2021";*/
	   static final String USER = "root";
	   static final String PASS = "";
	   //Se genera consulta SQL de inserción
	   //static final String QUERY = "INSERT INTO personas(dni, nombre, edad) VALUES(10,'angel', 20)";
	   //static final String QUERY = "DELETE FROM personas WHERE dni=10";
	   static final String QUERY = "SELECT * FROM personas";


	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement sentencia = conn.createStatement();) {
			//Para Insert o Delete
			//sentencia.executeUpdate(QUERY);
			
			//Para Resultados de SELECT
			ResultSet rs = sentencia.executeQuery(QUERY);
			
			while (rs.next()) {
				System.out.println(rs.getInt("dni"));
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getInt("edad"));
				System.out.println("------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
