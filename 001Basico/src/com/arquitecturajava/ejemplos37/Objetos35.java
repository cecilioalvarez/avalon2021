package com.arquitecturajava.ejemplos37;

public class Objetos35 {
public static void main(String[] args) {
	
	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	//hace uso de un properties
	
	// a mi me gustaria gestionar un interface 
	LibroRepository repositorio= new LibroRepositoryJDBC();
	
	Libro libro= repositorio.buscarUno("1");
	System.out.println(libro.getIsbn());
	System.out.println(libro.getTitulo());
	System.out.println(libro.getAutor());
	
	
	repositorio.borrar(new Libro("3"));
	
	
}

}
