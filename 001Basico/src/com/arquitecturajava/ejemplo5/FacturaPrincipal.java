package com.arquitecturajava.ejemplo5;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura f=new Factura(1,"pago de television",1200);
		System.out.println(f.importeConIVA());
		System.out.println(f.importeConDescuento());
		
		
	}

}
