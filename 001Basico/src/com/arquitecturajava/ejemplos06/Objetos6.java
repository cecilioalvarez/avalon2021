package com.arquitecturajava.ejemplos06;

public class Objetos6 {

	public static void main(String[] args) {
		
		Factura f= new Factura(1,"ordenador",200);
		
		System.out.println(f.getImporte());
		System.out.println(f.getImporteConDescuento(20));
		System.out.println(f.getImporteConIVA());
		

		

	}

}
