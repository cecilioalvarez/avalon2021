package Ejemplos35;

import java.util.List;

public class Objetos35b {

	public static void main(String[] args) {
		
		List<Libro> lista = Libro.buscarTodos();
		for (Libro libro: lista) {
			System.out.println(libro.getIsbn());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getAutor());
		}
		System.out.println(lista.get(1).getAutor());
		//lista.get(1).borrar();
	}

}
