package ejemplos40_Java8_Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal3 {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("Pedro","Gomez",20));
		lista.add(new Persona("Maria","Blanco",30));
		lista.add(new Persona("Gema","Perez",10));
		
		List<Persona> nueva = filtrarPersonas(new FiltroPersonaNombre("Pedro"),lista);
		for (Persona persona : nueva) {
			System.out.println(persona);
		}
		System.out.println("-----------------");
		nueva = filtrarPersonas(new FiltroPersonaApellidos("Perez"),lista);
		for (Persona persona : nueva) {
			System.out.println(persona);
		}
	
	
	}

	public static List<Persona> filtrarPersonas(FiltroPersona filtroPersonas,List<Persona> listaPersonas){
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if(filtroPersonas.test(p)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}
}
