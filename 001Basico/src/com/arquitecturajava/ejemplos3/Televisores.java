package com.arquitecturajava.ejemplos3;

public class Televisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor t1=new Televisor();

		t1.setMarca("Sony");
		t1.setEncendido(true);
		t1.setPrecio(100);
		System.out.println(t1.encendido);
		System.out.println(t1.marca);
		System.out.println(t1.precio);
		
	}

}
