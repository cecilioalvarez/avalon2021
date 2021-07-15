package com.arquitecturajava.ejemplo16;

public class Objeto16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1=new Rectangulo(2,2);
		System.out.println(r1.area());
		
		System.out.println(Rectangulo.area(2, 2));
		System.out.println(Rectangulo.perimetro(2, 2));
	}

}
