package ejercicio36;

import java.util.List;

public class Objetos36c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LibroRepository repositorio=new LibroRepositoryJDBC();
		List<Libro> libros=repositorio.BuscarTodosConCapitulos();
		
		for(Libro l: libros) {
			System.out.println(l);
			for(Capitulo c:l.getCapitulos()) {
				System.out.println(c.getTitulo());
				System.out.println(c.getPaginas());
			}
		}
	}

}
