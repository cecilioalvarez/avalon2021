package com.arquitecturajava.ejemplos15;

public class LibroDigital extends Documento{

	private String plataforma;
	
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public LibroDigital(String titulo, String autor, int paginas) {
		super(titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}

}
