package ejemplos34_SQL4Patron_Repository;

import java.util.List;

public class Objetos34_LibroRepository {

	public static void main(String[] args) {
		
		LibroRepository repositorio = new Libro_RepositoryJDBC();
		
		Libro libro = repositorio.buscarLibro("A2");
		System.out.println(libro.toString());
		
		repositorio.addBook(new Libro("A3","pepe","Libro de Pepe"));
		
		List<Libro> lista= repositorio.buscarTodosLibros();
		
		for (Libro libroItem : lista) {
			System.out.println(libroItem.toString());
		}
		
		repositorio.removeBook(new Libro("A3"));

	}

}
