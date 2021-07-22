package Ejemplo36B_Libro;

public class Objeto35 {
	
	public static void main(String[] args) {
		
		LibroRepository repositorio= new LibroRepositoryJDBC();

		Libro libro= repositorio.buscarUno("27");
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		
		
	}

}