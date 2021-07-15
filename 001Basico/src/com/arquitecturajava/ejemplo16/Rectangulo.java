package com.arquitecturajava.ejemplo16;

public class Rectangulo {
	private int lado1;
	private int lado2;
	
	
	public Rectangulo(int lado1, int lado2) {
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
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
	//staticos e implementados como estaticos
	public static double area(int lado1,int lado2) {
		return lado1*lado2;
	}
	
	public static double perimetro(int lado1,int lado2) {
		return lado1*2+lado2*2;
	}
	//funciones a nivel de instancia que delegan en los metodos estaticos	
	public double area() {
		return area(this.getLado1(),this.getLado2());
	}
	
	public double perimetro() {
		return perimetro(this.getLado1(),this.getLado2());
	}
	
	
}
