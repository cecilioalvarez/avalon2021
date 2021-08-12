package ejemplo01_java8;

import java.util.ArrayList;

import java.util.List;

//ORDENADOR UNA LISTA_ OPCIONES COLLECTIONS.SORT
public class Principal {
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		lista.add(new Persona("cris", "garcia1", 33));
		lista.add(new Persona("ale", "garcia3", 29));
		lista.add(new Persona("ana", "garcia", 34));
	
		System.out.println("------orden edad--------------");
		//Collections.sort(lista);
		
		/*lista.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});*/
		
		//ANONIMOUS CLASS
		lista.sort((o1,o2) -> {
			return o1.getNombre().compareTo(o2.getNombre());
		});
		for (Persona per : lista) {
			System.out.println(per);
		}
		System.out.println("------orden Nombre--------------");
		/*lista.sort(new PersonaNombreComparator());
		for (Persona per : lista) {
			System.out.println(per);
		}
		
		System.out.println("------Orden apellidos--------------");
		lista.sort(new PersonaApellidosComparator());
		for (Persona per : lista) {
			System.out.println(per);
		}*/
	}

}
