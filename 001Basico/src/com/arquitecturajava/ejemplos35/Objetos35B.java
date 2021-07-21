package com.arquitecturajava.ejemplos35;

import java.util.List;

public class Objetos35B {
public static void main(String[] args) {
	
	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	//hace uso de un properties
	
	List<LibroAR> lista= LibroAR.buscarTodos();
	
	for (LibroAR libro: lista) {
		
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		
	}
	
}

}
