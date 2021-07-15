package com.arquitecturajava.ejemplos16;

import java.util.ArrayList;

public class Objeto16 {

	public static void main(String[] args) {
		// variable de tipo compra el importe sale 100 no añade nada
		// clase padre
		CompraStandard cs= new CompraStandard("pepe", "ordenador", 100);
		System.out.println(cs.getImporteTotal());
		
		// variable de tip ocompra el importe sale 100 no añade nada
		CompraPrime cp= new CompraPrime("pepe", "ordenador", 100);
		System.out.println(cp.getImporteTotal());
		
		ArrayList<Compra> lista= new ArrayList<Compra>();
		lista.add(cs);
		lista.add(cp);
		double total=0;
		for (Compra c: lista) {
			total+=c.getImporteTotal();
			
		}
		System.out.println(total);
		
		
		
		
	}
}
