package com.arquitecturajava.ejemplos13;

public class Rectangulo {
	private int lado1;
	private int lado2;
	
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	//funciones estaticas implementadas
	public static double areaRectangulo(int lado1, int lado2) {
		return lado1*lado2;
	}
	
	public static double perimetroRectangulo(int lado1, int lado2) {
		return lado1*2+lado2*2;
	}
	
	//Funciones a nivel de instancia que delegan en el
	public double area() {
		return areaRectangulo(this.getLado1(),this.getLado2());
	}
	
	public double perimetro() {
		return perimetroRectangulo(this.getLado1(),this.getLado2());
	}
	
	
	public Rectangulo(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
}
