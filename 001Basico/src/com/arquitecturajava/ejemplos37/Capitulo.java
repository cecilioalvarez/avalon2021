package com.arquitecturajava.ejemplos37;

import java.util.List;

public class Capitulo {
	private String titulo;
	private int paginas;
	private Libro libro;
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Capitulo(String titulo, int paginas) {
		super();
		this.titulo = titulo;
		this.paginas = paginas;

	}
	public Capitulo(String titulo) {
		super();
		this.titulo = titulo;
	}
	
}
