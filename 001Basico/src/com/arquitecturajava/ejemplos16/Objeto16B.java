package com.arquitecturajava.ejemplos16;

import java.util.ArrayList;

public class Objeto16B {

	public static void main(String[] args) {
		CompraEstandar cs = new CompraEstandar("pepe", "ordenador", 100);
		CompraPrime cp = new CompraPrime("Ruben", "ordenador", 100);
		CompraPrime cp2 = new CompraPrime("Manolo", "ordenador", 300);
		CompraPrime cp3 = new CompraPrime("Jose", "ordenador", 200);
		
		Cliente c = new Cliente();
		c.addCompra(cs);
		c.addCompra(cp);

		System.out.println(c.getImporteTotalCompras());
		System.out.println(c.getImporteMasAlto());
		/*System.out.println(c.getCompraMasCara().getImporteTotal());*/
			
	}
}
