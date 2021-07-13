package com.arquitecturajava;

public class HolaMundo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lista= new int[5];
		lista[0]=4;
		lista[1]=5;
		lista[2]=6;
		lista[3]=7;
		lista[4]=8;
		
		for (int i=0; i<lista.length;i++) {
			if (lista[i]>=5) {
				System.out.println(lista[i]);
			}
		}
	}

}
