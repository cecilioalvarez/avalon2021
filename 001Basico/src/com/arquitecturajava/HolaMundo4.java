package com.arquitecturajava;

import java.math.BigDecimal;

public class HolaMundo4 {
	
	public static void main(String[] args) {
		
		double nota1=4.2;
		double nota2=4.3;
		BigDecimal numero3= new BigDecimal(100.243467888888);
		BigDecimal numero4= new BigDecimal(100.242345777777);
		BigDecimal numero5=numero4.subtract(numero3);
		
		System.out.println(nota1+nota2);
		System.out.println(nota1-nota2);
		System.out.println(nota1/nota2);
		System.out.println(nota1*nota2);
		System.out.println(Math.round((nota1-nota2) * 100.0) / 100.0);
		System.out.println(numero5.doubleValue());
	}

}
