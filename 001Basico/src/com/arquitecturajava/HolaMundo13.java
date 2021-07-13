package com.arquitecturajava;

public class HolaMundo13 {
	public static void main(String[] args) {
		int[] lista= new int[5];
		lista[0]=4;
		lista[1]=5;
		lista[2]=6;
		lista[3]=7;
		lista[4]=8;
		
		for (int i=0; i<lista.length;i++) {
			System.out.println(lista[i]);
		}
		for (int i=0; i<lista.length;i++) {
			lista[i]=lista[i]+1;
		}
		for (int i=0; i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
}
