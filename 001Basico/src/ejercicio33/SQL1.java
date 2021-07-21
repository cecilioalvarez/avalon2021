package ejercicio33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL1 {

	static final String DB_URL="jdbc:mysql://localhost:3306/avalon";
	static final String USER ="root";
	static final String PASS="";
	static final String QUERY="insert into Personas(dni,nombre,edad) values(10,'angel',20)";
	static final String QUERY2="select * from Personas";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn =DriverManager.getConnection(DB_URL,USER,PASS);
			Statement sentencia=conn.createStatement();
//			sentencia.execute(QUERY);
			ResultSet rs=sentencia.executeQuery(QUERY2);
			while(rs.next()) {
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
