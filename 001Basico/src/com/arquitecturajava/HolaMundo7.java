package com.arquitecturajava;

public class HolaMundo7 {
	public static void main(String[] args) {
		
		int num = 2;
		
		if (num ==2 || num == 4 || num ==6 || num == 8) {
			System.out.println("Es numero par");
		}
		
		if (num %2 == 0) {
			System.out.println("Es numero par");
		}
		
		//Operador Ternario ?
		System.out.println((num >5 ? "Has Aprobado" : "Has Suspendido"));
	}
}
