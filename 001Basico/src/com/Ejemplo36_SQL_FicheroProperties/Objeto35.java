package Ejemplo36_SQL_FicheroProperties;

import java.util.List;

public class Objeto35 {

	public static void main(String[] args) {

		// DataBaseHelper helper= new
		// DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
		// hace uso de un properties

//		DataBaseHelper helper= new DataBaseHelper();
//		LibroAR libroAR= new LibroAR("27");
//		//instancia metodo que accede a cada una de las propiedades del objeto
//		// nosotros con this.getIsbn();
//		libroAR.borrar();

//		LibroAR libroAR=  LibroAR.buscarUno("31");
//		
//		System.out.println(libroAR.getIsbn());
//		System.out.println(libroAR.getTitulo());
//		System.out.println(libroAR.getAutor());
//		// traza
//		System.out.println(libroAR);

		//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
		//hace uso de un properties

		List<LibroAR> lista= LibroAR.buscarTituloyAutor("java", "pedro");

		for (LibroAR libro: lista) {

			System.out.println(libro.getIsbn());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getAutor());

		}

	}

	}