package com.arquitecturajava.ejemplos15;

public class Comic extends Libro {
	private String dibujante;
	
	public String getDibujante() {
		return dibujante;
	}

	public void setDibujante(String dibujante) {
		this.dibujante = dibujante;
	}

	public Comic(String titulo, String autor, int paginas, int peso, String editorial) {
		super(titulo, autor, paginas, peso, editorial);
	}
}
