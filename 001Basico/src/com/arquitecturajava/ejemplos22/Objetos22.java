package com.arquitecturajava.ejemplos22;

public class Objetos22 {
public static void main(String[] args) {
	
	Imprimible i= new Impresora();
	i.imprimir();
	
	i= new FotoCopiadoraImpresora();
	i.imprimir();
}
}
