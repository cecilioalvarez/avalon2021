package com.arquitecturajava.ejemplos22;

public class Objetos22 {
	public static void main(String[] args) {
		Imprimir i = new Impresora();
		i.imprimir();
		
		i=new FotocopiadoraImpresora();
		i.imprimir();
	}
}
