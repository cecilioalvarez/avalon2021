package ejercicio12;

import java.util.ArrayList;

public class Objetos12 {
	public static void main(String[] args) {
			ArrayList<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona("Ale", 29));
		lista.add(new Persona("jesus", 26));
		lista.add(new Persona("ana", 29));
		lista.add(new Persona("cris", 29));
	

		for (Persona elto : lista) {
			System.out.println(elto.getNombre() + " "+ elto.getEdad());
		}
		System.out.println("/////////////");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getEdad());
		}
	}

}
