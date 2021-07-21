package sql2;

public class SQL9Objetos {
	public static void main(String[] args) {
		
		//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
		//hace uso de un properties
		
		DataBaseHelper helper= new DataBaseHelper();
		Libro libroAR= new Libro("6", "jaaaa", "autor");
		//instancia metodo que accede a cada una de las propiedades del objeto
		// nosotros con this.getIsbn();
		//libroAR.borrar();
		//libroAR.insertar();
		//Mas correcto llamar a las propiedades que usar el toString, pq aporta si quieres logear o usar consola
		//pero si no, es mas correcto poner los getIsbn o propiedadesq sean
		System.out.println(libroAR.buscarPorTituloAutor("ee", "ana"));
		System.out.println(libroAR.buscarPorTituloOAutor("titulo", "ee"));
		//libroAR.update("256");
	}
	


}
