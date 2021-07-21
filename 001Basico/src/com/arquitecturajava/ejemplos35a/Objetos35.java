package com.arquitecturajava.ejemplos35a;

public class Objetos35 {
public static void main(String[] args) {
	
	DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:3306/avalon","root","");
	
	LibroAR libroAR= new LibroAR("25","java","ana",helper);
	libroAR.insertar();
	
	
}

}
