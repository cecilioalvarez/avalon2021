package com.arquitecturajava;

import java.util.Scanner;

public class holamundo5 {
	
	public static void main(String [] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("dame una nota");
	int numero=sc.nextInt();
	if (numero>5 && numero<7) {
		System.out.println("has aprobado");
	}else if (numero>=7 && numero<9) {
		System.out.println("notable");
	}else {
		System.out.println("sobresaliente");
	}
}
}