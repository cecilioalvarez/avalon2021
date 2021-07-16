package com.arquitecturajava.ejemplos23;

public class Objeto23 {
public static void main(String[] args) {
	
	Documento d= new Documento(1,"hola esto es texto",1);
	GestorDocumentalWord gd= new GestorDocumentalWord();
	gd.salvar(d);
	gd.versionar(d);
	
}
}
