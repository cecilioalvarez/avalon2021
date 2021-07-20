package ejemplos32_SQL2_Ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQL2_EjercicioInsercion2_Libro {
	
	   static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USER = "mavalon";
	   static final String PASS = "avalon2021";
	   //Se genera consulta SQL de inserción
	   //static final String QUERY = "INSERT INTO personas(dni, nombre, edad) VALUES(10,'angel', 20)";
	   //static final String QUERY = "DELETE FROM personas WHERE dni=10";
	   static final String QUERY = "SELECT * FROM libro";


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String queryInsert= "INSERT INTO libro(isbn, titulo, autor) VALUES(?,?,?)";
		String queryDelete= "DELETE FROM libro WHERE isbn=?";
		String queryUpdate= "UPDATE libro set autor='Pedro' WHERE isbn=?";
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement sentencia = conn.createStatement();) {
			
			conn.setAutoCommit(false);
			try(PreparedStatement prepSentencia = conn.prepareStatement(queryInsert);){
				//PreparedStatement
				/*prepSentencia.setString(1, "A1");
				prepSentencia.setString(2, "Libro de David");
				prepSentencia.setString(3, "david");
				
				prepSentencia.execute();
				
				prepSentencia.setString(1, "A2");
				prepSentencia.setString(2, "Libro de Pedro");
				prepSentencia.setString(3, "pedro");
				
				prepSentencia.execute();*/
				
				PreparedStatement prepSentencia2 = conn.prepareStatement(queryDelete);
			
				//PreparedStatement
				prepSentencia2.setString(1, "A1");
				
				prepSentencia2.execute();
				
				PreparedStatement prepSentencia3 = conn.prepareStatement(queryUpdate);
				
				//PreparedStatement
				prepSentencia3.setString(1, "A2");
				
				prepSentencia3.execute();
			}catch (Exception ex) {
				ex.printStackTrace();
				conn.rollback();
			}
			conn.commit();
			
			//Para Resultados de SELECT
			ResultSet rs = sentencia.executeQuery(QUERY);
			
			while (rs.next()) {
				System.out.println(rs.getString("isbn"));
				System.out.println(rs.getString("titulo"));
				System.out.println(rs.getString("autor"));
				System.out.println("------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
