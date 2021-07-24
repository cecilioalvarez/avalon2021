package Ejemplo37;

import java.util.List;

public class Objetos37 {
public static void main(String[] args) {

	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	//hace uso de un properties

	// a mi me gustaria gestionar un interface 
	CapituloRepository repositorio= new CapituloRepositoryJDBC();

	List<Capitulo> capitulos= repositorio.buscarTodos();

	for (Capitulo c: capitulos) {

		System.out.println(c.getTitulo());
	}





}

}