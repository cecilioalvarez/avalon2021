package com.arquitecturajava.ejemplos15;

public class Libro extends Documento{
	private int peso;
	private String editorial;
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	// Super es invocar al contructor de la clase superior
	public Libro(String titulo, String autor, int paginas, int peso, String editorial) {
		super(titulo,autor,paginas);
		this.peso=peso;
		this.editorial= editorial;
	}

	//Sobrecargamos el metodo de documento imprimir
	@Override
	public void imprimir() {
		System.out.println("el libro se imprime por capitulos");
	}

}
