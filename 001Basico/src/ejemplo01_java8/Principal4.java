package ejemplo01_java8;

import java.util.ArrayList;
import java.util.List;

public class Principal4 {
	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "perez", 10));

		List<Persona> nueva = filtrarPersonasPorNombre("pedro", lista);

		for (Persona p : nueva) {

			System.out.println(p);
		}
		
		System.out.println("---------------------");
		
		
		List<Persona> nueva2 = filtrarPersonasPorApellido("gomez", lista);

		for (Persona persona : nueva2) {
			System.out.println(persona);
		}

	}

	public static List<Persona> filtrarPersonasPorNombre(String nombre, List<Persona> listaPersonas) {

		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {

			if (p.getNombre().equals(nombre)) {

				listaFinal.add(p);
			}
		}
		return listaFinal;

	}
	
	public static List<Persona> filtrarPersonasPorApellido(String apellido, List<Persona> listaPersonas) {

		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {

			if (p.getApellidos().equals(apellido)) {

				listaFinal.add(p);
			}
		}
		return listaFinal;

	}

}
