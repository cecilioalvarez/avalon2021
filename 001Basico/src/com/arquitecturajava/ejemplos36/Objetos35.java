package com.arquitecturajava.ejemplos36;

public class Objetos35 {
public static void main(String[] args) {
	
	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	//hace uso de un properties
	
	
	LibroRepository libroAR=  LibroRepository.buscarUno("1");
	
	System.out.println(libroAR.getIsbn());
	System.out.println(libroAR.getTitulo());
	System.out.println(libroAR.getAutor());
	// traza
	System.out.println(libroAR);
	
}

}
