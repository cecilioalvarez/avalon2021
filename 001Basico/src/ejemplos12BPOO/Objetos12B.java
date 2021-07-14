package ejemplos12BPOO;

import java.util.ArrayList;
import java.util.Iterator;

public class Objetos12B {
	public static void main(String[] args) {
		ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
		
		listaPersonas.add(new Persona("Pepe",23));
		listaPersonas.add(new Persona("Pedro",26));
		listaPersonas.add(new Persona("Maria",24));
		listaPersonas.add(new Persona("Mario",28));
		
		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i).getNombre()+"-"+listaPersonas.get(i).getEdad());
			System.out.println("-------------");
		}
		//Foreach es más correcto
		System.out.println("----Foreach----");
		for (Persona persona : listaPersonas) {
			System.out.println(persona.getNombre()+"-"+persona.getEdad());
		}
		
		Iterator <Persona> it = listaPersonas.iterator();
		System.out.println("----Iterator----");
		while (it.hasNext()) {
			Persona p=it.next();
			System.out.println(p.getNombre()+"-"+p.getEdad());
			System.out.println("-------------");
		}
		
		System.out.println("----Foreach Compactado----");
		listaPersonas.forEach((p)->System.out.println(p.getNombre()));
	}
}
