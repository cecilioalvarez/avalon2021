package SQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {
	static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USER = "root";
	   static final String PASS = "metrica123";
	   static final String QUERY = "SELECT * FROM personas";
	   
	   public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement sentencia = con.createStatement();
			ResultSet rs = sentencia.executeQuery(QUERY);
			while (rs.next()) {
				System.out.println(rs.getInt("dni"));
			}
			//sentencia.execute(QUERY);
			
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
