package ejemplo40_java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Principal3 {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "perez", 10));

		// declaracion de una funcion con su cuerpo 
		// la tengo referenciada por una variable 

		Comparator<Persona> f1=(o1, o2)-> o1.getNombre().compareTo(o2.getNombre());
		Comparator<Persona> f2=(o1, o2)-> o1.getApellidos().compareTo(o2.getApellidos());

		// anonimous class
		lista.sort(f2);

		System.out.println("**************");
		for (Persona p : lista) {

			System.out.println(p);
		}



	}

}