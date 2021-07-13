package com.arquitecturajava.ejemplos3;

public class Televisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor t1=new Televisor("Samsung",100,false);

		System.out.println(t1.getMarca());
		System.out.println(t1.getPrecio());
		System.out.println(t1.isEncendido());
		
		
	}

}
