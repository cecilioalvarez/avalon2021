package com.arquitecturajava.ejemplos3;

public class Facturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f1= new Factura(1001,"Arreglo",125);

		System.out.println("Importe con IVA: " +f1.getImporteIVA());
		System.out.println("Importe sin IVA: " +f1.getImporte());
		System.out.println("Importe con descuento: " +f1.getImporteDescuento());
	}

}
