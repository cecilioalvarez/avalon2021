package ejercicio36;

public class Objeto36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibroRepository repositorio=new LibroRepositoryJDBC();
		Libro libro =repositorio.buscarUno("1");
		
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		
		repositorio.borrar(new Libro("3"));
		

	}

}
