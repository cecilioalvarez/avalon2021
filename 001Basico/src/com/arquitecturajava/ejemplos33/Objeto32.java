package com.arquitecturajava.ejemplos33;

public class Objeto32 {

	public static void main(String[] args) {

		Bolsa<String> b = new Bolsa<String>(3);

		b.add("galletas");
		b.add("tomates");
		b.add("otra");
		b.add("leche");

		for (String o : b.getLista()) {

			System.out.println(o.toUpperCase());
		}
		
		
		Bolsa<Producto> b1 = new Bolsa<Producto>(3);

		b1.add(new Producto("peras"));
		b1.add(new Producto("tomates"));
		b1.add(new Producto("anchoas"));
	

		for (Producto p : b1.getLista()) {

			System.out.println(p.getNombre());
		}
	}
}
