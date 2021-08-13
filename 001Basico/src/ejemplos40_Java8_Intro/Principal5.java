package ejemplos40_Java8_Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Principal5 {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Pedro","Gomez",20));
		lista.add(new Persona("Maria","Blanco",30));
		lista.add(new Persona("Gema","Perez",10));
		
		//De esta manera aprovecho la interfaz peor no tengo que crear una Clase por cada Filtro
		List<Persona> nueva = filtrarPersonas((Persona p)->p.getNombre().equals("Pedro"),lista);
		for (Persona persona : nueva) {
			System.out.println(persona);
		}
		System.out.println("-----------------");
		nueva = filtrarPersonas((p)->p.getApellidos().equals("Perez"),lista);
		for (Persona persona : nueva) {
			System.out.println(persona);
		}
	
	
	}

	//USO de Predicate de JAVA 8 (Misma función que interfaz Filtro creada por nosotros), Sin uso de Interfaces externas
	public static List<Persona> filtrarPersonas(Predicate<Persona> filtro,List<Persona> listaPersonas){
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if(filtro.test(p)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}
}
