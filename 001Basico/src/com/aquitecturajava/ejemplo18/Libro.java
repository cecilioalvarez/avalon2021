package com.aquitecturajava.ejemplo18;

public class Libro extends Documento{
	private String titulo;
	private String autor;
	
	
	public Libro(String nombre, String titulo, String autor) {
		super(nombre);
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
