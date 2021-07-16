package com.arquitecturajava.ejemplos22;

public class Multifuncion implements Imprimir, Copiar, Scanner {
	@Override
	public void scanner() {
		System.out.println("El escaner esta escaneando");
		
	}
	@Override
	public void copiar() {
		System.out.println("El escaner esta copiando");
		
	}
	@Override
	public void imprimir() {
		System.out.println("El escaner esta imprimiendo");
		
	}
}
