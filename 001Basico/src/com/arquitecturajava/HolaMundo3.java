package com.arquitecturajava;

import java.util.Scanner;

public class HolaMundo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una nota");
		int numero = sc.nextInt();
		if (numero>4) {
			System.out.println("Aprobado!");

			} else {
				System.out.println("Suspenso!");
		}
		
	}

}
