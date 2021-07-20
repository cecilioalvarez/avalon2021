package com.arquitecturajava.ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQL4Ejercicio {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   
	   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dni = 0;
		System.out.print("Introduzca DNI: ");
		dni=sc.nextInt();
		sc.nextLine();
		String nombre = null;
		System.out.print("Introduzca nombre: ");
		nombre = sc.nextLine();
		int edad = 0;
		System.out.print("Introduzca edad: ");
		edad=sc.nextInt();
		
		try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement sentencia = conn.createStatement();){
					
					String CONSULTA = "insert into personas (dni, nombre, edad) values ("+dni+",'"+nombre+"',"+edad+")";
					sentencia.executeUpdate(CONSULTA);
					
			}catch(SQLException e) {
				e.printStackTrace();
			}

	}

}
