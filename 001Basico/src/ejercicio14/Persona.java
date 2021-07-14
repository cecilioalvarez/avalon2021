package ejercicio14;

import java.util.ArrayList;

public class Persona {

	private int edad;
	private String nombre;
	private ArrayList<Nota> notas = new ArrayList<Nota>();

	public Persona(int edad, String nombre, ArrayList<Nota> notas) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.notas = notas;
	}

	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void addNota(Nota nota) {
		this.notas.add(nota);
	}

	public void removeNota(Nota nota) {
		this.notas.remove(nota);
	}

	public Nota getMejorNota() {
		Nota mayor = new Nota("lengua", 0);
		for (Nota elto : this.getNotas()) {
			if (mayor.getValor() < elto.getValor()) {
				mayor = elto;
			}

		}
		return mayor;
	}

	public ArrayList<Nota> getMejoresNotas() {
		int max = 0;
		Nota notaMaxima = null;
		ArrayList<Nota> mejoresNotas = new ArrayList<Nota>();

		for (Nota elto : this.getNotas()) {
			if (elto.getValor() > max) {

				max = elto.getValor();
			}

		}
		for (Nota elto : this.getNotas()) {
			if (elto.getValor() == max) {
				mejoresNotas.add(elto);
			}

		}
		return mejoresNotas;
	}

	public Nota getNotaMejor(String asignatura) {
		Nota mayor = new Nota("lengua", 0);
		for (Nota elto : this.getNotas()) {
			if (elto.getAsignatura() == asignatura) {
				if (mayor.getValor() < elto.getValor()) {
					mayor = elto;
				}
			}
		}
		return mayor;

	}

}
