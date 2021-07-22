package com.arquitecturajava.ejemplos37;

import java.util.List;

public interface CapituloRepository {

	void insertar(Capitulo capitulo);

	void actualizar(Capitulo capitulo);

	void borrar(Capitulo capitulo);

	List<Capitulo> buscarTodos();

	Capitulo buscarUno(String titulo);


}