package ejercicio40;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal6 {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "perez", 10));

		List<Persona> nueva = filtrarPersonas((p) -> p.getNombre().equals("pedro"), lista);

		for (Persona p : nueva) {
			System.out.println(p);
		}

	}

	public static List<Persona> filtrarPersonas(Predicate<Persona> filtro, List<Persona> listaPersonas) {
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if (filtro.test(p)) {
				listaFinal.add(p);
			}
		}

		return listaFinal;
	}

}