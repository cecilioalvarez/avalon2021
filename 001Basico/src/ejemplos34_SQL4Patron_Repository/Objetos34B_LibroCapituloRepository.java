package ejemplos34_SQL4Patron_Repository;

import java.util.List;

public class Objetos34B_LibroCapituloRepository {

	public static void main(String[] args) {
		
		LibroRepository repositorio = new Libro_RepositoryJDBC();
		
		
		
		//repositorio.addChapter(new Capitulo("Cap 1",23));
		
		List<Libro> lista= repositorio.buscarTodosLibrosConCapitulos();
		
		for (Libro libroItem : lista) {
			System.out.println(libroItem.toString());
			for (Capitulo cap : libroItem.getListacoCapitulos()) {
				System.out.println(cap.toString());
			}
			
		}
		
		//repositorio.removeChapter(new Capitulo("Cap 1"));

	}

}
