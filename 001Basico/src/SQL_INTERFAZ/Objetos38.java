package SQL_INTERFAZ;

import java.util.List;

public class Objetos38 {
	public static void main(String[] args) {
		// DataBaseHelper helper= new
		// DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
		// hace uso de un properties

		// a mi me gustaria gestionar un interface
		LibroRepository repositorio = new LibroRepositoryJDBC();
		CapituloRepository repositorioCap = new CapituloRepositoryJDBC();
		//repositorioCap.insertar(new Capitulo("capit2", 25, new Libro("25", "pigmeos", "ayende")));
		// repositorio.insertar(new Libro("25", "pigmeos", "ayende"));

		List<Libro> libros = repositorio.buscarTodosConCapitulos();

		for (Libro l : libros) {

			System.out.println(l.getTitulo());
			System.out.println(l.getAutor());
			System.out.println(l.getIsbn());
			for (Capitulo c : l.getCapitulos()) {

				System.out.println(c.getTitulo());
				System.out.println(c.getPaginas());
			}
		}

	}

}
