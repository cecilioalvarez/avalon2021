package com.arquitecturajava;

public class HolaMundo10 {

	public static void main(String[] args) {
		
		for (int i=0;i<10;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println("_______________________________________");
		
		int j=0;
		while (j<10) {
			System.out.println(j);
			j++; // tambien se puede colocar como j=j+1
		}
		
		System.out.println("_______________________________________");
		
		int k=0;
		do {
			System.out.println(k);
			k++;
		}while (k<10);
		
		System.out.println("_______________________________________");
		
		int resultado;
		System.out.println("Tabla del 7");
		for (int i=0; i<11; i++) {
			resultado = 7 * i;
			System.out.println("7 X " + i + " = " + resultado);
		}
	
		System.out.println("________tabla del 7_______________________________");
		
		for (int l=1;l<=10;l++) {
			System.out.println(l*7);
		}
		
		System.out.println("________sumatoria_______________________________");
		
		int total=0;
		for (int i=0;i<=5;i++) {
			total=total+i;
		}
		System.out.println(total);
	}

}
