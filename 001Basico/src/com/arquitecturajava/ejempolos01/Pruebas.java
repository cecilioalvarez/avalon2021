package com.arquitecturajava.ejempolos01;

public class Pruebas {
	
	static int numero=4;
	public static void main(String[] args) {
		
		
		System.out.println(numero);
		
		int numero2;
		numero2=8;
		
		System.out.println(numero2);
		
		if (numero+numero2<10) {
			System.out.println("Es menor que 10");
		}else if(numero+numero2==10){
			System.out.println("Es igual 10");
		}else {
			System.out.println("Es mayor que diez");
		}
		
		
	}
}

