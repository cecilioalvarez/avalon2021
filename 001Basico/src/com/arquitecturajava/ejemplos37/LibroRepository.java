package com.arquitecturajava.ejemplos37;

import java.util.List;

public interface LibroRepository {

	void insertar(Libro libro);

	void actualizar(Libro libro);

	void borrar(Libro libro);

	List<Libro> buscarTodos();

	Libro buscarUno(String isbn);

	Libro buscarUnoPorTitulo(String titulo);

	Libro buscarUnoPorAutor(String autor);

	List<Libro> buscarTodosTituloAutor(String titulo, String autor);
	
	List<Libro> buscarTodosConCapitulos();

}