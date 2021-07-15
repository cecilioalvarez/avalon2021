package com.arquitecturajava.ejemplos15;

public class Libro extends Documento {

	private int peso;
	private String editorial;
	
	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Libro(String titulo, String autor, int paginas,int peso, String editorial) {
		
		
		super(titulo, autor, paginas);
		this.peso=peso;
		this.editorial=editorial;
	}

}
