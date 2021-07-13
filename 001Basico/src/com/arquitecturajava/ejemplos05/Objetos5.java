package com.arquitecturajava.ejemplos05;

public class Objetos5 {

	public static void main(String[] args) {
		
		Televisor t= new Televisor("samsung",1000,true);
		
		
		System.out.println(t.isEncendido());
		t.on();
		System.out.println(t.isEncendido());
		t.off();
		System.out.println(t.isEncendido());
		
	
	}
}
