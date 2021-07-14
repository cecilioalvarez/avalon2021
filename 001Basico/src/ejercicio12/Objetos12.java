package ejercicio12;

import java.util.ArrayList;
import java.util.Iterator;

public class Objetos12 {
	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("Ale", 29));
		lista.add(new Persona("jesus", 26));
		lista.add(new Persona("ana", 29));
		lista.add(new Persona("cris", 29));
		
		//La mas correcta y actualizada.

		for (Persona elto : lista) {
			System.out.println(elto.getNombre() + " " + elto.getEdad());
		}
		System.out.println("/////////////");
		
		//JAVA 8 , FUNCIONES LAMBDA
		
		lista.forEach((p)-> System.out.println(p.getNombre()));

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNombre() + " " + lista.get(i).getEdad());
		}
		
		System.out.println("///////////////////");
		Iterator<Persona> it = lista.iterator();
		
		while (it.hasNext()) {
			Persona persona = it.next();
			System.out.println(persona.getNombre());
			System.out.println(persona.getEdad());
		}
		
		
		
	}

}
