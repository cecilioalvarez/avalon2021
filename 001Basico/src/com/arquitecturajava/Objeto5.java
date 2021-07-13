package com.arquitecturajava;

public class Objeto5 {

	public static void main(String[] args) {
		
		Televisor t= new Televisor("Samsung", 1000, true);
	
		
		System.out.println(t.isEncendido());
		t.on();
		System.out.println(t.isEncendido());
		t.off();
		System.out.println(t.isEncendido());
	}
}
