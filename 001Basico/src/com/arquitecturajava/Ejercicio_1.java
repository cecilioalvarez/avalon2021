package com.arquitecturajava;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 1 numero:");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero:");
		int num2 = sc.nextInt();
			
		if (num1>num2) {
			System.out.println(num1+ " es mayor que "+num2);
		}
		else if (num2>num1) {
			System.out.println(num2+ " es mayor que "+num1);
		}
		else {
			System.out.println("Son iguales "+num1+" y "+num2);
		}
		
		
	}
}
