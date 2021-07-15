package com.arquitecturajava.ejemplos16;

import java.util.ArrayList;

public class Objeto16 {

	public static void main(String[] args) {
		CompraEstandar cs = new CompraEstandar("pepe", "ordenador", 100);
		System.out.println(cs.getImporteTotal());
		
		CompraPrime cp = new CompraPrime("pepe", "ordenador", 100);
		System.out.println(cp.getImporteTotal());
		
		ArrayList<Compra> lista = new ArrayList<Compra>();
		lista.add(cs);
		lista.add(cp);
		double total = 0;
		for(Compra c: lista) {
			total = c.getImporte();
		}
	}

}
