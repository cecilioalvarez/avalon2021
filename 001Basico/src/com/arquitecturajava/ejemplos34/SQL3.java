package com.arquitecturajava.ejemplos34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL3 {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   static final String CONSULTA = "select * from personas";

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery(CONSULTA);
				){
			
				while(rs.next()) {
					//Imprime las diferentes columnas por cada fila
					System.out.println(rs.getInt("dni"));
					System.out.println(rs.getString("nombre"));
					System.out.println(rs.getInt("edad"));
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
