package Ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQL4 {

	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	static final String USUARIO = "root";
	static final String CLAVE = "";
	// genero una consulta sql de inserción
	//static final String CONSULTA = "insert into Personas (dni,nombre,edad) values (10,'angel',20)";

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dni=0;
		String nombre=null;
		int edad=0;
		System.out.println("por favor introduce un dni");
		dni=sc.nextInt();
		System.out.println("por favor introduce un nombre");
		sc.nextLine();
		nombre=sc.nextLine();
		System.out.println("por favor introduce la edad");
		edad=sc.nextInt();

		try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();) {
			String CONSULTA= "insert into Personas (dni,nombre,edad) values ("+ dni +",'"+ nombre+"',"+edad+")";
			sentencia.executeUpdate(CONSULTA);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}