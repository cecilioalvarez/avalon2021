package com.arquitecturajava.ejemplos35Cecilio;

import java.util.List;

public class Objetos35B {
	public static void main(String[] args) {
		List<LibroAR> lista= LibroAR.buscarTodos();
		
		for (LibroAR libro: lista) {
			
			System.out.println(libro.getIsbn());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getAutor());
			
		}
		
		List<LibroAR> lista2= LibroAR.buscarTodosTituloAutor("Harry Potter","J.K.Rowling");
		
		for (LibroAR libro2: lista2) {
			
			System.out.println(libro2.getIsbn());
			System.out.println(libro2.getTitulo());
			System.out.println(libro2.getAutor());
			
		}
	}

}
