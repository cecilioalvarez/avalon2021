package com.arquitecturajava.ejemplos23;

public class Objetos23 {

	public static void main(String[] args) {
		Documento d = new Documento(1,1,"hora esto es texto");
		GestorDocumentalWorld gd = new GestorDocumentalWorld();
		gd.salvar(d);
		gd.versionar(d);

		GestorDocumental gd1 = GestorFactory.getGestor("word");
		gd1.salvar(d);
		gd1.versionar(d);
	}

}
