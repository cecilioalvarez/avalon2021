package com.arquitecturajava;



public class HolaMundo9 {

	public static void main(String[] args) {
		
		System.out.println("Bucle for");
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Bucle while");
		int j=0;
		while(j<10) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("Bucle do/while");
		int k = 0;
		do {
			System.out.println(k);
			k++;
		}while(k<10);
	}
}
