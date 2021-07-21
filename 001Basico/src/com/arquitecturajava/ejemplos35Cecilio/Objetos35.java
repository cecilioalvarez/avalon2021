package com.arquitecturajava.ejemplos35Cecilio;

public class Objetos35 {
	public static void main(String[] args) {
	
	//DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:3306/avalon","root","");
	//hace uso de un properties
	
	DataBaseHelper helper= new DataBaseHelper();
	LibroAR libroAR= new LibroAR("26","java","ana");
	libroAR.insertar();
	//LibroAR libroAR= new LibroAR("26");
	//libroAR.borrar();
	}

}
