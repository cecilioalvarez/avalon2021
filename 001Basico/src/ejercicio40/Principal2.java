package ejercicio40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("pedro", "gomez", 20));
		lista.add(new Persona("maria", "blanco", 30));
		lista.add(new Persona("gema", "alvarez", 10));
		
		lista.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				
				return o1.getNombre().compareTo(o2.getNombre());
			}
			
		});
		
//		Comparator<Persona> f1=(p1, p2)->p1.getNombre().compareTo(p2.getNombre());
//		Comparator<Persona> f2=(p1, p2)->p1.getApellidos().compareTo(p2.getApellidos());
//		
//		lista.sort(f1);
//		lista.sort(f2);
		
		lista.sort((p1, p2)->p1.getNombre().compareTo(p2.getNombre()));
		
		
		for (Persona p : lista) {

			System.out.println(p);
		}

		

	}

}
