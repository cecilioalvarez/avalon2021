package com.arquitecturajava.ejemplos22;

public class FotocopiadoraImpresora implements Imprimir, Copiar {

	@Override
	public void copiar() {
		System.out.println("La fotocopiadoraimpresora esta copiando");
	}

	@Override
	public void imprimir() {
		System.out.println("La fotocopiadoraimpresora esta imprimiendo");
		
	}

}
