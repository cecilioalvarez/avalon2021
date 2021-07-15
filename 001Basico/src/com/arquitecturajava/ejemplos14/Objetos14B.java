package com.arquitecturajava.ejemplos14;

public class Objetos14B {
public static void main(String[] args) {
	
	
	Rectangulo r1= new Rectangulo (2,2);
	
	System.out.println(r1.area());
	System.out.println(r1.perimetro());
	
	System.out.println(Rectangulo.area(5, 5));
}
}
