package com.arquitecturajava.ejemplos22;

public class FotoCopiadoraImpresora implements CopiableImprimible{

	@Override
	public void copiar() {
		System.out.println("la fotocopiadora copia");
		
	}

	@Override
	public void imprimir() {
	
		System.out.println("la fotocopiadora imprime");
		
	}

}
