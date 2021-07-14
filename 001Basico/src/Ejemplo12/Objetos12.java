package Ejemplo12;

import java.util.ArrayList;

public class Objetos12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("Hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		lista.remove(0);
		lista.remove("estas");
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		ArrayList<Persona> listaPersonas=new ArrayList<Persona>();
		Telefono t1=new Telefono(333,"Samsung");
		Telefono t2=new Telefono(456,"Samsung");
		Telefono t3=new Telefono(2389,"Samsung");
		Telefono t4=new Telefono(9745,"Samsung");
				
		listaPersonas.add(new Persona("Juan",32,t1));
		listaPersonas.add(new Persona("Maria",21,t2));
		listaPersonas.add(new Persona("Laura",22,t3));
		listaPersonas.add(new Persona("Pedro",37,t4));
		for (Persona p : listaPersonas) {
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
	}

}
