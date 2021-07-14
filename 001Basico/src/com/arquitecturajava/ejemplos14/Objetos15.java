package com.arquitecturajava.ejemplos14;

public class Objetos15 {
	public static void main(String[] args) {
		Rectangulo r = new Rectangulo(2,2);
		
		System.out.println(Rectangulo.areaRectangulo(3, 3));
		System.out.println(Rectangulo.perimetroRectangulo(3, 3));
		System.out.println(r.area());
		System.out.println(r.perimetro());
	}
}
