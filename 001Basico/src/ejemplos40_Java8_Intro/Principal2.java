package ejemplos40_Java8_Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Pedro","Gomez",20));
		lista.add(new Persona("Maria","Blanco",30));
		lista.add(new Persona("Gema","Perez",10));
		
		List<Persona> nueva = filtrarPersonasPorNombre("Pedro", lista);
		for (Persona persona : nueva) {
			System.out.println(persona);
		}
		System.out.println("----------------");
		nueva = filtrarPersonasPorApellidos("Perez", lista);
		for (Persona persona : nueva) {
			System.out.println(persona);
		}
		
	}

	public static List<Persona> filtrarPersonasPorNombre(String nombre,List<Persona> listaPersonas){
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if(p.getNombre().equals(nombre)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}
	
	public static List<Persona> filtrarPersonasPorApellidos(String apellidos,List<Persona> listaPersonas){
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if(p.getApellidos().equals(apellidos)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}
}
