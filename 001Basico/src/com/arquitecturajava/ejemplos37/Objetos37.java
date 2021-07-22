package com.arquitecturajava.ejemplos37;

import java.util.List;

public class Objetos37 {
	public static void main(String[] args) {

		LibroRepository repositorio2 = new LibroRepositoryJDBC();
		List<Libro> libros = repositorio2.buscarTodosConCapitulos();

		for (Libro c1 : libros) {
			System.out.println(c1.getTitulo());
			System.out.println(c1.getAutor());
			System.out.println(c1.getIsbn());
		}

		System.out.println("-----------------------------------");
		CapituloRepository repositorio = new CapituloRepositoryJDBC();
		List<Capitulo> capitulos = repositorio.buscarTodos();

		for (Capitulo c : capitulos) {
			System.out.println(c.getTitulo());
		}
	}

}
