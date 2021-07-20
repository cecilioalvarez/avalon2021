package ejemplos31_SQL1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL4_ConsultasPreparadas {
	
	   static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	   /*static final String USER = "mavalon";
	   static final String PASS = "avalon2021";*/
	   static final String USER = "root";
	   static final String PASS = "";
	   //Se genera consulta SQL de inserción
	   static final String QUERY = "INSERT INTO personas(dni, nombre, edad) VALUES(?,?,?)";


	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);) {
			
			//Transaccional
			conn.setAutoCommit(false);
			try(PreparedStatement sentencia = conn.prepareStatement(QUERY);){
				//PreparedStatement
				sentencia.setInt(1, 7);
				sentencia.setString(2, "david2");
				sentencia.setInt(3, 25);
				
				sentencia.execute();
				
				sentencia.setInt(1, 6);
				sentencia.setString(2, "marta");
				sentencia.setInt(3, 25);
				
				sentencia.execute();
			
			}catch (Exception ex) {
				ex.printStackTrace();
				conn.rollback();
			}
			conn.commit();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
