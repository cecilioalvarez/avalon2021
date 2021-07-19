package com.arquitecturajava.ejemplos01;

public class HolaMundo14 {

	public static void main(String[] args) {
		
		// esto es una lista de elementos
		int[] lista= new int[5];
		lista[0]=4;
		lista[1]=5;
		lista[2]=7;
		lista[3]=8;
		lista[4]=9;
		
		for ( int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		for ( int i=0;i<lista.length;i++) {
			lista[i]=lista[i]+1;
		}
		
		for ( int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		
	}
}
