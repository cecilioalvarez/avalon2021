package com.arquitecturajava;

import java.util.Scanner;
import java.math.BigDecimal;
public class holamundo7 {
	
	public static void main(String [] args) {

		
		
	int numero=2;
	
	if (numero==2 || numero==4 || numero==6|| numero==8) {
	
	System.out.println("el n�mero es par");
	}	
	if(numero % 2==0) {
		System.out.println(numero);
	}
	System.out.println((numero > 5 ? "has aprobado":"has suspendido"));
}
}
