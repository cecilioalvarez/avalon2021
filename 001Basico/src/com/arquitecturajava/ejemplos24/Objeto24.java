package com.arquitecturajava.ejemplos24;

public class Objeto24 {

	public static void main(String[] args) {
		
		// en el programa main no vemos que haga
		// uso de otra clase que no sea la clase Pan
		
		Pan mipan= FactoriaPan.getPan("baggete");
		System.out.println(mipan.getPeso());
		System.out.println(mipan.getIngrediente());
		mipan.cocer();
		
	}

}
