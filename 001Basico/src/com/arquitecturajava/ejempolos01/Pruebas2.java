package com.arquitecturajava.ejempolos01;
//Array empieza en 0

public class Pruebas2 {
	public static void main(String[] args) {
		double [] notas;
		notas= new double[9];
		
		notas[0]=7.30;
		notas[1]=6.57;
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println(notas[i]);
		}
	}
}
