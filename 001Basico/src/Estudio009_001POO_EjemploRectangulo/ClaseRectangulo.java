package Estudio009_001POO_EjemploRectangulo;

import Estudio009_000.Negocio;

public class ClaseRectangulo {
	//definimos las propiedades
	double lado1;
	double lado2;
	
	//definimos las funcionalidades
	public double area() {
		return lado1*lado2;
	}
	
	public double perimetro() {
		return (lado1*2)+(lado2*2);
	}
	
	public void area (double lado1,double lado2) {
		System.out.println(lado1*lado2);
	}
}
