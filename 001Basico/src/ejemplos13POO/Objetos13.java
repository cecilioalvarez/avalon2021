package ejemplos13POO;

import java.util.ArrayList;

public class Objetos13 {
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
	}
}
