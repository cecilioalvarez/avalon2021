package com.arquitecturajava.ejemplos13;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private int edad;
	private ArrayList<Nota> notas= new ArrayList<Nota>();
	
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void addNota(Nota nota) {
		
		this.notas.add(nota);
	}
	
	public Nota getNotaMejor() {
		
		int maximo=0;
		//instanciar la nota del alumno , simplemente referenciariamos
		// a la que tiene en la lista
		Nota notaMaxima=null;
		
		for (Nota n:notas) {
			
			if (n.getValor()>maximo) {
				notaMaxima=n;
				maximo=n.getValor();
			}
		}
		return notaMaxima;
	}
	
	public void removenota(Nota nota) {
		
		this.notas.remove(nota);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	
	}
	
	
}
