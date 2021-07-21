package ejercicio34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLPreparadas {
	

	static final String DB_URL="jdbc:mysql://localhost:3306/avalon";
	static final String USER ="root";
	static final String PASS="";
	static final String QUERY="insert into Personas(dni,nombre,edad) values(?,?,?)";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn =DriverManager.getConnection(DB_URL,USER,PASS);
			try {
				
				//transaccional
				conn.setAutoCommit(false);
				PreparedStatement sentencia=conn.prepareStatement(QUERY);
				sentencia.setInt(1, 7);
				sentencia.setString(2, "david");
				sentencia.setInt(3, 25);
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
