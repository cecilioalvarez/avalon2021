package ejemplos34_SQL4Patron_Repository;

import java.util.List;

public interface LibroRepository {

	void addBook(Libro libro);

	void removeBook(Libro libro);

	List<Libro> buscarTodosLibros();

	Libro buscarLibro(String isbn);

	List<Libro> buscarLibroAutor(String autor);

	List<Libro> buscarLibroTitulo(String titulo);

	List<Libro> buscarLibroAutorTitulo(String autor, String titulo);

	void modifyBook(Libro libro);

}