package com.arquitecturajava.ejemplos12;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	//Metodo para añadir notas
	public void addNota (Nota nota) {
		this.notas.add(nota);
	}
	
	//Metodo para borrar notas
	public void removeNota(Nota nota) {
		this.notas.remove(nota);
	}
	
	//Metodo para sacar la nota mas alta
	public Nota getMejorNota() {
		Nota nota = new Nota("", 0);
		for(Nota n: notas) {
			if(n.getValor()>nota.getValor()) {
				nota = n;
			}
		}
		return nota;
	}
	
	public ArrayList<Nota> getMejoresNotas(){
		int maximo = 0;
		ArrayList<Nota> notasMejores = new ArrayList<Nota>();
		//Se recorre con el bucle para conocer la nota más alta
		for(Nota n: notas) {
			if(n.getValor()>maximo) {
				maximo = n.getValor();
			}
		}
		//Recorremos el bucle de notas y si coinciden con la nota máximo lo 
		//añadimos al array
		for(Nota n: notas) {
			if(n.getValor() == maximo) {
				notasMejores.add(n);
			}
		}
		return notasMejores;
	}
	
	public Nota getMejoresNotas(String asignatura) {
		int maximo = 0;
		Nota notaMaxima = null;
		//Se recorre con el bucle para conocer la nota más alta de la asignatura que le pasemos
		for(Nota n: notas) {
			if(n.getValor()>maximo && n.getAsignatura().equals(asignatura)) {
				notaMaxima = n;
				maximo = n.getValor();
			}
		}
		return notaMaxima;
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
}
