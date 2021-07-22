package com.arquitecturajava.ejemplos37;

import java.util.List;

public interface CapituloRepository {

	void actualizar(Capitulo libro);

	void insertar(Capitulo libro);

	void borrar(Capitulo libro);

	List<Capitulo> buscarTodos();

	

	Capitulo buscarUno(String isbn);

}