package com.arquitecturajava;

import java.util.Scanner;

public class ejercicio {
	
	public static void main(String [] args) {

		Scanner sc=new Scanner(System.in);
		
		
	int numero1=sc.nextInt();
	int numero2=sc.nextInt();
	if (numero1>numero2) {
		System.out.println("El primer n�mero es el mayor");
	}else {
		System.out.println("El segundo n�mero es el mayor");
	}
}
}
