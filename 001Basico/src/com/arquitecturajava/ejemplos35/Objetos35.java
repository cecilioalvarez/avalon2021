package com.arquitecturajava.ejemplos35;

public class Objetos35 {
public static void main(String[] args) {
	
	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	//hace uso de un properties
	
	DataBaseHelper helper= new DataBaseHelper();
	LibroAR libroAR= new LibroAR("27");
	//instancia metodo que accede a cada una de las propiedades del objeto
	// nosotros con this.getIsbn();
	libroAR.borrar();
	
	
}

}
