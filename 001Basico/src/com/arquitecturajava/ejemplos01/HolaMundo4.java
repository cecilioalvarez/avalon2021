package com.arquitecturajava.ejemplos01;

import java.math.BigDecimal;
import java.util.Scanner;

public class HolaMundo4 {

	public static void main(String[] args) {
		
		double nota1=4.2;
		double nota2=4.3;
		BigDecimal numero3= new BigDecimal(100.2434567888888);
		BigDecimal numero4= new BigDecimal(100.2423456777777);
		BigDecimal numero5=numero4.subtract(numero3);
		
		System.out.println(nota1+nota2);
		System.out.println(numero5.doubleValue());
		System.out.println(nota1/nota2);
		System.out.println(nota1*nota2);
		
		
	}
	
}
