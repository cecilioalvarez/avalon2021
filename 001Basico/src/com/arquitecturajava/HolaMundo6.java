package com.arquitecturajava;

import java.util.Scanner;

public class HolaMundo6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce otro numero");
		int numero2 = sc2.nextInt();
		
		if (numero > numero2) {
			System.out.println("El numero mayor es: " + numero);

			
		} else {
			System.out.println("El numero mayor es: " + numero2);

		}
	
	}

}