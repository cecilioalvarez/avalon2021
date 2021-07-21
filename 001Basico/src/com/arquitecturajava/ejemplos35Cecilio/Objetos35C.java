package com.arquitecturajava.ejemplos35Cecilio;

import java.util.List;

public class Objetos35C {
	public static void main(String[] args) {
		LibroAR libroAR= LibroAR.buscarUno("26");
		System.out.println(libroAR.getIsbn());
		System.out.println(libroAR.getTitulo());
		System.out.println(libroAR.getAutor());
	}

}
