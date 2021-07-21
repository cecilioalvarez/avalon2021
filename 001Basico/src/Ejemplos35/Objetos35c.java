package Ejemplos35;

import java.util.List;

public class Objetos35c {

	public static void main(String[] args) {
		
		//List<Libro> lista = Libro.buscarTodos();
		/*for (Libro libro: lista) {
			System.out.println(libro.getIsbn());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getAutor());
		}*/
		//System.out.println(lista.get(1).getAutor());
		//lista.get(1).borrar();
		Libro l1=null;
		Libro l2=new Libro("1111","Eva","Perez-Reverte");
		l2.actualizar();
		//l1=Libro.buscarUno("1111");
		
		//System.out.println(l1.getAutor());
		Libro l3=null;
		l3=Libro.buscarPorAutor("ana");
		System.out.println(l3.getTitulo());
		
	}

}
