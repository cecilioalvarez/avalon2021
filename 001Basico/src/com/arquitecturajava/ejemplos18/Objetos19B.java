package com.arquitecturajava.ejemplos18;

public class Objetos19B {

	public static void main(String[] args) {

		Azulejo l1= new Azulejo(2,3);
		Azulejo l2= new Azulejo(4,4);
		
		Pared p= new Pared();
		p.addAzulejo(l1);
		p.addAzulejo(l2);
		
		p.removeAzulejo(l1);
		
		System.out.println(l1.equals(l2));
		System.out.println(p.area());
		
	}
}
