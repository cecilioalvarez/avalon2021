package com.arquitecturajava;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabla del numero");
		int num = sc.nextInt();
		
		for(int i =0;i<=10;i++) {
			System.out.println(num*i);
		}
	}
}
