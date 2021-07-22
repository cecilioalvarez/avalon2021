package com.arquitecturajava.ejemplos36;

public class Objetos35 {
public static void main(String[] args) {
	
	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	//hace uso de un properties
	
	
	LibroRepository repositorio= new LibroRepository();
	
	Libro libro= repositorio.buscarUno("1");
	System.out.println(libro.getIsbn());
	System.out.println(libro.getTitulo());
	System.out.println(libro.getAutor());
	
	
	repositorio.borrar(new Libro("3"));
	
	
}

}
