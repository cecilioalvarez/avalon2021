package ejemplo40_java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
public class Principal5 {
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "perez", 10));

		List<Persona> nueva = filtrarPersonas(new FiltroPersonaNombre("pedro"), lista);

		for (Persona p : nueva) {

			System.out.println(p);
		}

		System.out.println("*************");
		nueva = filtrarPersonas(new FiltroPersonaApellidos("perez"), lista);

		for (Persona p : nueva) {

			System.out.println(p);
		}
	}
	//un interface pero claso este interface no tiene implementacion ahora mismo
	public static List<Persona> filtrarPersonas(FiltroPersona filtro, List<Persona> listaPersonas) {
		List<Persona> listaFinal = new ArrayList<Persona>();
		for (Persona p : listaPersonas) {
			if (filtro.test(p)) {
				listaFinal.add(p);
			}
		}
		return listaFinal;
	}
	
}