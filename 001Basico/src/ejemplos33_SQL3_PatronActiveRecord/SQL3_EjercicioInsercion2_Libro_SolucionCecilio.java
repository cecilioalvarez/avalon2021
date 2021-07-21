package ejemplos33_SQL3_PatronActiveRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQL3_EjercicioInsercion2_Libro_SolucionCecilio {
	
	//Se usan para constructor
	   static final String DB_URL = "jdbc:mysql://localhost:3306/avalon";
	   static final String USER = "mavalon";
	   static final String PASS = "avalon2021";


	public static void main(String[] args) {
		
		List<Libro_ActiveRecord> myListaLibros = new ArrayList<Libro_ActiveRecord>();
		//DataBaseHelper helper = new DataBaseHelper(DB_URL, USER, PASS);
		//DataBaseHelper helper = new DataBaseHelper();
		//Ahora helper se coge en clase libro directamente
		Libro_ActiveRecord libroToAdd = new Libro_ActiveRecord("A4", "Ana", "Java junior");
		
		libroToAdd.addBook();
		
		myListaLibros = Libro_ActiveRecord.buscarTodosLibros();
		
		for (Libro_ActiveRecord libro : myListaLibros) {
			System.out.println(libro.toString());
		}
		
		libroToAdd.modifyBook("titulo","Python Jr");
		myListaLibros = Libro_ActiveRecord.buscarTodosLibros();
		System.out.println("-------------------------------------------");
		for (Libro_ActiveRecord libro : myListaLibros) {
			System.out.println(libro.toString());
		}
		
		libroToAdd.removeBook();
		myListaLibros = Libro_ActiveRecord.buscarTodosLibros();
		System.out.println("-------------------------------------------");
		for (Libro_ActiveRecord libro : myListaLibros) {
			System.out.println(libro.toString());
		}
		System.out.println("-------------------------------------------");
		Libro_ActiveRecord libroToFind=Libro_ActiveRecord.buscarLibro("A4");
		/*if (libroToFind!=null) {
			System.out.println(libroToFind.toString());
		}else {
			System.out.println("Libro NO Encontrado en DB");
		}*/
		System.out.println(libroToFind == null ? "No se han encontrado coincidencias." : libroToFind.toString());
		
		System.out.println("-------------------------------------------");
		libroToAdd = new Libro_ActiveRecord("A5", "David", "Libro de Pedro");
		libroToAdd.addBook();
		myListaLibros = Libro_ActiveRecord.buscarLibroAutor("David");
		libroToAdd.removeBook();
		for (Libro_ActiveRecord libro : myListaLibros) {
			System.out.println(libro.toString());
		}
		System.out.println("-------------------------------------------");
		libroToAdd = new Libro_ActiveRecord("A5", "Ana", "Libro de Pedro");
		libroToAdd.addBook();
		myListaLibros = Libro_ActiveRecord.buscarLibroTitulo("Libro de Pedro");
		libroToAdd.removeBook();
		for (Libro_ActiveRecord libro : myListaLibros) {
			System.out.println(libro.toString());
		}
		System.out.println("-------------------------------------------");
		libroToAdd = new Libro_ActiveRecord("A5", "David","Libro de David");
		libroToAdd.addBook();
		myListaLibros = Libro_ActiveRecord.buscarLibroAutorTitulo("David","Libro de David");
		libroToAdd.removeBook();
		for (Libro_ActiveRecord libro : myListaLibros) {
			System.out.println(libro.toString());
		}
		
	}
	
}
