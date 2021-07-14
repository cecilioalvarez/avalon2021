package ejemploArray;

import java.util.ArrayList;
import java.util.Iterator;

public class Objetos1 {
	
	public static void main(String[] args) {
		
		ArrayList<Persona> lista= new ArrayList<Persona>();
		
		lista.add(new Persona("david"));
		lista.add(new Persona("fran"));
		lista.add(new Persona("hola"));
		
		for (Persona p : lista) {
			
			if(p.getNombre().equals("hola")) {
				System.out.println(p.getNombre());
			}
		
		}
		
	}
}
