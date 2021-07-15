package com.arquitecturajava.ejemplos16;

import java.util.ArrayList;

public class Objeto16B {

	public static void main(String[] args) {
		
		CompraStandard cs= new CompraStandard("pepe", "ordenador", 100);
		CompraPrime cp= new CompraPrime("pepe", "ordenador", 100);
		
		Cliente c= new Cliente("pedro");
		c.addCompra(cs);
		c.addCompra(cp);
		System.out.println(c.getImporteTotalCompras());
		
		
		
		
	}
}
