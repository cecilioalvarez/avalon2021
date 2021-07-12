package com.arquitecturajava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	
	private static double askForNumber() {
		double number = 0;
		try {
			number = new Scanner(System.in).nextDouble();
		} catch (InputMismatchException ime_ex) {
			System.err.println("Error en la entrada de datos.");	
		}
		return number;
	}
	
	public static void main(String[] args) {
		System.out.print("Introduce el primer número:\t");
		double number_1 = Ejercicio1.askForNumber();
		System.out.print("Introduce el segundo número:\t");
		double number_2 = Ejercicio1.askForNumber();
		
		if (number_1 > number_2) {
			System.out.println("El mayor número es el primero: " + number_1);
		} else if (number_2 > number_1) {
			System.out.println("El mayor número es el segundo: " + number_2);
		} else {
			System.out.println("Ambos números son iguales.");
		}
	}
}
