package com.arquitecturajava.ejemplos01;

import java.util.Scanner;

public class HolaMundo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una nota");
		int numero = sc.nextInt();
		
		if(numero>5 && numero<7) {
			System.out.println("has aprobado");
		} else if (numero>=7 && numero<=9) {
			System.out.println("has notable");
		} else {
			System.out.println("Sobresaliente");
		}
	}

}
