package com.arquitecturajava.ejemplos01;

import java.util.Scanner;

public class HolaMundo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=3;
		if(numero==4 || numero==8) {
			System.out.println("el número es par");
		}
		if(numero%2==0) {
			System.out.println("el número es par");
		}
		
		System.out.println((numero >5 ? "has aprobado" : "has suspendido"));

	}

}
