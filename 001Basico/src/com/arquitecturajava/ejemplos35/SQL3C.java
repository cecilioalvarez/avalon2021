package com.arquitecturajava.ejemplos35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL3C {
	static final String URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USUARIO = "root";
	   static final String CLAVE = "";
	   static final String CONSULTA = "select * from Libro";

	public static void main(String[] args) {
		
		try(Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
			Statement sentencia = conn.createStatement();
			ResultSet rs = sentencia.executeQuery(CONSULTA);
				){
			
				while(rs.next()) {
					//Imprime las diferentes columnas por cada fila
					System.out.println(rs.getString("isbn"));
					System.out.println(rs.getString("titulo"));
					System.out.println(rs.getString("autor"));
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
