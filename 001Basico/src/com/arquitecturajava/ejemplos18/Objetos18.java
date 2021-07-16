package com.arquitecturajava.ejemplos18;

public class Objetos18 {

	public static void main(String[] args) {
		Pared p = new Pared();
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2));
		p.addAzulejo(new Azulejo(2,2),new Azulejo(2,2));
		
		System.out.println(p.area());
	}

}
