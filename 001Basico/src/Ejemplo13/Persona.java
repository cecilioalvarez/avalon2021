package Ejemplo13;

import java.util.ArrayList;



public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Nota> notas;
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		notas = notas;
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
	public void addNota(Nota nota) {
		this.notas.add(nota);
	}
	public void removeNota(Nota nota) {
		this.notas.remove(nota);
	}
}
