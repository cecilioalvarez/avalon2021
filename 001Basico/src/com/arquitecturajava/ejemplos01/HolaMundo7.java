package com.arquitecturajava.ejemplos01;



public class HolaMundo7 {

	public static void main(String[] args) {
		
		int numero=2;
		
		if(numero==2 || numero==4 || numero == 6 || numero == 8) {
			System.out.println("el número es par");
		}
		
		if (numero % 2 == 0) {
			System.out.println("el número es par");
		}
		
		//operador ternario
		System.out.println((numero > 5 ? "has aprobado" : "has suspendido"));
	}
}
