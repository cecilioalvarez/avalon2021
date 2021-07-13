package com.arquitecturajava;

public class Objeto5 {

	public static void main(String[] args) {
		
		Televisor t=new Televisor();
		t.setMarca("samsung");
		t.setPrecio(1000);
		t.setEncendido(true);
		
		System.out.println(t.isEncendido());
	}
}
