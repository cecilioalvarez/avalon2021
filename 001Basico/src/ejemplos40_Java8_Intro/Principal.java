package ejemplos40_Java8_Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Pedro","Gomez",20));
		lista.add(new Persona("Maria","Blanco",30));
		lista.add(new Persona("Gema","Perez",10));
		
		Collections.sort(lista);
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		
		System.out.println("-----------------------------");
		
		lista.sort(new PersonaNombreComparator());
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		
		System.out.println("-----------------------------");
		
		lista.sort(new PersonaApellidosComparator());
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		
		System.out.println("-----------------------------");
		
		//Esto es una Anonimous Class
		lista.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
		
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		
		System.out.println("-----------------------------");
		
		//Uso de Funcion Lambda
		lista.sort((o1, o2)->{
			return o1.getApellidos().compareTo(o2.getApellidos()); 
		});
		
		//Uso de Funcion Lambda Pura
		lista.sort((o1, o2)->o1.getApellidos().compareTo(o2.getApellidos()));
		
		//Función lambda en variable
		Comparator<Persona> f1 = (o1, o2)->o1.getApellidos().compareTo(o2.getApellidos());
		lista.sort(f1);
		for (Persona persona : lista) {
			System.out.println(persona);
		}
		

	}

}
