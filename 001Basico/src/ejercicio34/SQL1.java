package ejercicio34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class SQL1 {

	static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un dni:");
		p.setDni(sc.nextInt());
		System.out.println("Introduce un nombre:");
		p.setNombre(sc.nextLine());
		System.out.println("Introduce un edad:");
		p.setEdad(sc.nextInt());

		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			String Consulta = "insert into Personas (dni,nombre,edad) values (" + p.getDni() + ",'" + p.getNombre()
					+ "'," + p.getEdad() + ")";
			String ConsultaUpdate = "update Personas set nombre='emilio' where dni=1";
			Statement sentencia = conn.createStatement();

			sentencia.execute(Consulta);

//			ResultSet rs=sentencia.executeQuery(Consulta);
//			while(rs.next()) {
//				System.out.println(rs.getInt("dni"));
//				System.out.println(rs.getString("nombre"));
//				System.out.println(rs.getInt("edad"));
//				
//			}
//			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
