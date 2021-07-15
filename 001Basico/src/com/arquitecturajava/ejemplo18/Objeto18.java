package com.arquitecturajava.ejemplo18;

public class Objeto18 {

	public static void main(String[] args) {
		CompraStandard cs= new CompraStandard("pepe", "ordenador", 100);
		System.out.println(cs.getImporteTotal());
	}
}
