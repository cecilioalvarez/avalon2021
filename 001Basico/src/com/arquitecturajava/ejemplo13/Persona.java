package com.arquitecturajava.ejemplo13;

import java.util.ArrayList;
import java.util.Iterator;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Nota> notas = new ArrayList<Nota>();

	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
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

	public void addNota(Nota nota) {
		this.notas.add(nota);
	}

	public void removeNota(Nota nota) {
		this.notas.remove(nota);
	}

	public Nota getNotaMejor() {
		Nota nota = new Nota();
		for (Nota n : notas) {
			if (n.getValor() > nota.getValor()) {
				nota = n;
			}
		}
		return nota;
	}
	
	public ArrayList<Nota> getMejoresNotas(){
		ArrayList<Nota> listanotas = new ArrayList<Nota>();
		Nota notamax=new Nota();
		for(Nota  n: notas) {
			if(n.getValor()>notamax.getValor()) {
				notamax=n;
			}
				
		}
		for(Nota  n: notas) {
			if(notamax.getValor()==n.getValor())
				listanotas.add(notamax);
		}
		
		return listanotas;
		
		
	}

}
