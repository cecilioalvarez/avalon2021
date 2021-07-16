package com.arquitecturajava.ejemplos23;

public class Objeto23 {
public static void main(String[] args) {
	
	Documento d= new Documento(1,"hola esto es texto",1);
	
	//Patron de factoria para crear los diferentes gestores de documentos
	// el que usa el programa no sabe cuantos tipos de gestores exdisten
	
	GestorDocumental gd= GestorFactory.getGestor("wordpress");
	gd.salvar(d);
	gd.versionar(d);
	
	GestorDocumental gd1= GestorFactory.getGestor("word");
	gd1.salvar(d);
	gd1.versionar(d);
	
}
}
