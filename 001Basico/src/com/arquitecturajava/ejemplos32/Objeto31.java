package com.arquitecturajava.ejemplos32;

import com.arquitecturajava.ejemplos33.Bolsa;

public class Objeto31 {

	public static void main(String[] args) {
		Bolsa<String> b = new Bolsa<String>(3);
		b.add("galletas");
		b.add("tomates");
		b.add("otra");
		b.add("leche");
		
		for(String o: b.getLista()) {
			System.out.println(o.toUpperCase());
		}
	}

}
