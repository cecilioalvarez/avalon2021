package com.arquitecturajava.ejemplos36;

import java.util.List;

public class Objetos35D {
public static void main(String[] args) {
	
	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	//hace uso de un properties
	
	List<LibroRepository> lista= LibroRepository.buscarTituloyAutor("java", "pedro");
	
	for (LibroRepository libro: lista) {
		
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		
	}
	
}

}
