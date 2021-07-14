package ejemplos13POO;

import java.util.ArrayList;

public class Persona {

	private String nombre;
	private int edad;
	
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	//Constructor
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	//Getter y Setters
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
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	//metodos
	
	public void addNota(Nota nota) {
		this.notas.add(nota);
	}
	public void removeNota(Nota nota) {
		this.notas.remove(nota);
	}
	
	public Nota getNotaMax() {
		int valorMax=0;
		Nota notaMax=null;
		for (Nota nota : notas) {
			
			if (nota.getValor()>valorMax) {
				notaMax=nota;
				valorMax=notaMax.getValor();
			}
				
		}
		return notaMax;
		
	}
	
	public ArrayList<Nota> getMejoresNotas() {
		ArrayList<Nota> mejoresNotas = new ArrayList<Nota>();
		
		int valorMax=0;
		
		//Cecilio
		for (Nota nota : notas) {
			
			if (nota.getValor()>valorMax) {
				valorMax=nota.getValor();
			}
				
		}
		
		for (Nota nota : notas) {
			if(nota.getValor()==valorMax) {
				mejoresNotas.add(nota);
			}
		}
		
		return mejoresNotas;
		
	}
	
	public Nota getNotaMejor(String asignatura) {
		
		int valorMax=0;
		Nota notaMax=null;
		for (Nota nota : notas) {
			
			if (nota.getValor()>valorMax 
					&& nota.getAsignatura().equals(asignatura)) {
				notaMax=nota;
				valorMax=notaMax.getValor();
			}
				
		}
		return notaMax;
		
	}
	
	
}
