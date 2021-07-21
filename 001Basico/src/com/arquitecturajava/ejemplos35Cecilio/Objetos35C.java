package com.arquitecturajava.ejemplos35Cecilio;

import java.util.List;

public class Objetos35C {
	public static void main(String[] args) {
		LibroAR libroAR= LibroAR.buscarUno("26");
		System.out.println(libroAR.getIsbn());
		System.out.println(libroAR.getTitulo());
		System.out.println(libroAR.getAutor());
		
		System.out.println("------------------------------");
		
		LibroAR libroAR2= LibroAR.buscarUnoPorTitulo("Harry Potter");
		System.out.println(libroAR2.getIsbn());
		System.out.println(libroAR2.getTitulo());
		System.out.println(libroAR2.getAutor());
		
		System.out.println("------------------------------");
		
		LibroAR libroAR3= LibroAR.buscarUnoPorAutor("ana");
		System.out.println(libroAR3.getIsbn());
		System.out.println(libroAR3.getTitulo());
		System.out.println(libroAR3.getAutor());
		
	}

}
