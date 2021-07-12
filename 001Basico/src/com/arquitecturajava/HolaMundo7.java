package com.arquitecturajava;

import java.util.Scanner;

public class HolaMundo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame una nota");
		int numero = sc.nextInt();
		
		System.out.println(numero % 2 == 0 ? "PAR": "IMPAR");

	}

}
