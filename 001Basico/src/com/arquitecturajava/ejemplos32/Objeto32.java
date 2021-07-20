package com.arquitecturajava.ejemplos32;

public class Objeto32 {

	public static void main(String[] args) {

		BolsaCadenas b = new BolsaCadenas(3);

		b.add("galletas");
		b.add("tomates");
		b.add("otra");
		b.add("leche");

		for (String o : b.getLista()) {

			System.out.println(o.toUpperCase());
		}
	}
}
