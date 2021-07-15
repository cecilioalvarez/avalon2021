package com.arquitecturajava.ejemplos13;

public class Objetos14b {
	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(2,2);
		
		System.out.println(Rectangulo.areaRectangulo(3, 3));
		System.out.println(Rectangulo.perimetroRectangulo(3, 3));
		System.out.println(r.area());
		System.out.println(r.perimetro());
	}
}
