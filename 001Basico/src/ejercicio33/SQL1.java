package ejercicio33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL1 {

	static final String DB_URL="jdbc:mysql://localhost:3306/avalon";
	static final String USER ="root";
	static final String PASS="";
	static final String QUERY="insert into Personas(dni,nombre,edad) values(10,'angel',20)";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn =DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
