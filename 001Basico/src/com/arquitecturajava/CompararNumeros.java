package com.arquitecturajava;

import java.util.Scanner;

public class CompararNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("dame un número");
		int numero1=sc.nextInt();
		System.out.println("dame otro número");
		int numero2=sc.nextInt();
		if(numero1>numero2) {
			System.out.println("El número "+ numero1+" es mayor que "+ numero2);
		}else if(numero1<numero2){
			System.out.println("El número "+ numero2+" es mayor que "+ numero1);
		}else {
			System.out.println("Los números son iguales");
		}

	}

}
