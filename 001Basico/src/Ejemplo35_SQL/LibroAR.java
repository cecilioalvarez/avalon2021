package Ejemplo35_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroAR {
	
	

		private String isbn;
		private String titulo;
		private String autor;

		final String CONSULTA_INSERTAR = "insert into Libro (isbn,titulo,autor) values (?,?,?)";

		private DataBaseHelper helper;
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public LibroAR(String isbn, String titulo, String autor,DataBaseHelper helper) {
			super();
			this.isbn = isbn;
			this.titulo = titulo;
			this.autor = autor;
			this.helper=helper;
		}

		public   void  insertar () {
			try (Connection conn = DriverManager.getConnection(helper.getUrl(),helper.getUser(), helper.getPassword());
					PreparedStatement sentencia = conn.prepareStatement(CONSULTA_INSERTAR);
					) {

					sentencia.setString(1, this.getIsbn());
					sentencia.setString(2, this.getTitulo());
					sentencia.setString(3, this.getAutor());
					sentencia.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
	
}