package ejercicio36;

import java.util.List;

public interface LibroRepository {

	void insertar(Libro libro);

	void borrar(Libro libro);
	
	void actualizar(Libro libro);

	List<Libro> buscarTodos();

	Libro buscarUno(String isbn);

	List<Libro> BuscarTodosConCapitulos();
	
	Libro buscarPorTitulo(String titulo);

	Libro buscarPorAutor(String autor);

	List<Libro> buscarPorIituloAutor(String titulo, String autor);

}