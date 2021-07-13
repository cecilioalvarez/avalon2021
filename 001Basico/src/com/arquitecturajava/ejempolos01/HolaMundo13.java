package com.arquitecturajava.ejempolos01;

public class HolaMundo13 {

	public static void main(String[] args) {
		
		// esto es una lista de elementos
		int[] lista= new int[5];
		lista[0]=4;
		lista[1]=5;
		lista[2]=7;
		lista[3]=8;
		lista[4]=9;
		
		for ( int i=0;i<lista.length;i++) {
			
			if (lista[i]>=5) {
				System.out.println(lista[i]);
			}
			
		}
		
		
		
	}
}
