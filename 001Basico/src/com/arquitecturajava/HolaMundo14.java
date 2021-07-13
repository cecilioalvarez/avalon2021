package com.arquitecturajava;

import java.util.Iterator;

public class HolaMundo14 {
	public static void main(String[] args) {
		//Invocacion Funcion
		double resultado = suma(3,2);
		System.out.println(resultado);
	}
	//Declaración Funcion
	public static double suma(int a,int b) {
		int result = a+b;
		return result;
	}
}
