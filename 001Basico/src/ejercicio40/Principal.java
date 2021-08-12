package ejercicio40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "alvarez", 10));

		Collections.sort(lista);

		for (Persona p : lista) {

			System.out.println(p);
		}

		System.out.println("***********************");
		lista.sort(new PersonaNombreComparator());

		for (Persona p : lista) {

			System.out.println(p);
		}

	}

}
