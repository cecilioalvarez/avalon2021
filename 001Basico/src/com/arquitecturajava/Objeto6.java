package com.arquitecturajava;

public class Objeto6 {

	public static void main(String[] args) {
		
		Factura f= new Factura(1, "Luz", 200);
	
		
		System.out.println(f.getImporte());
		System.out.println(f.getImporteConDescuento(20));
		System.out.println(f.getImporteConIVA());
	}
}
