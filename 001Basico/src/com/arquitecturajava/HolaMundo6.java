package com.arquitecturajava;

import java.util.Scanner;

public class HolaMundo6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer n�mero");
		int numero1 = sc.nextInt();
		System.out.println("Escribe el segundo n�mero");
		int numero2 = sc.nextInt();
		
		if(numero1>numero2) {
			System.out.println("Orden de n�meros de mayor a menor");
			System.out.println("1- " + numero1);
			System.out.println("2- " + numero2);
		} else {
			System.out.println("Orden de n�meros de mayor a menor");
			System.out.println("1- " + numero2);
			System.out.println("2- " + numero1);
		}
	}
}
