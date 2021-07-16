package com.arquitecturajava.ejemplos23;

public class Objetos23 {

	public static void main(String[] args) {
		Documento d = new Documento(1,1,"hora esto es texto");
		//GestorDocumentalWorld gd = new GestorDocumentalWorld();
		gd.salvar(d);
		gd.versionar(d);

	}

}
