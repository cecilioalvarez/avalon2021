package com.arquitecturajava.ejemplos11;

public class Optimizacion {

	public static void main(String[] args) {

		long numero=System.currentTimeMillis();
		
		String cadena= "hola";
		
		String cadena2="hola2";
		
		String resultado="";
		StringBuilder resultado2= new StringBuilder();
		for (int i=0;i<100000;i++) {
			
			resultado2.append("hola");
			resultado2.append(i);
			
		}
			
		System.out.println(resultado2.toString());
		
		
		long numero2=System.currentTimeMillis();
		System.out.println(numero2-numero);
	}

}
