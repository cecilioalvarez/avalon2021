package com.arquitecturajava.ejemplos35;

public class Objetos35 {
public static void main(String[] args) {
	
	DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:8889/avalon","root","root");
	
	LibroAR libroAR= new LibroAR("25","java","ana",helper);
	libroAR.insertar();
	
	
}

}
