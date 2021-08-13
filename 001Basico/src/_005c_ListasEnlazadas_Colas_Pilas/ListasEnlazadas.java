package _005c_ListasEnlazadas_Colas_Pilas;

import java.util.LinkedList;

public class ListasEnlazadas {

	public static void main(String[] args) {
		
		LinkedList lista = new LinkedList();
		
		lista.add("cadena");
		lista.add(5);
		
		//add tambien tiene la opcion de index, para poder ingresar un dato en una posicion especifica
		//obligamos a que sea en la segunda posicion
		//si no colocamos el indice tomara la posicion natural en el orden de invocacion
		lista.add(1, 17); 
		lista.addFirst("conejo"); //adiciono al inicio
		lista.addLast("carne");// adiciono al final
		
		System.out.println("el tamaño de la lista es "+lista.size());
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		System.out.println(lista.getFirst());//primer valor de la lista
		System.out.println(lista.getLast()); //ultimo valor de la lsita
		
		//borrar un dato
		
		lista.remove(1); //segun el indice
		lista.removeFirst();//remuevo el primero en la lsita
		lista.removeLast();//remueve el ultimo de la lista
		
		System.out.println("el tamaño de la lista es "+lista.size());
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
	}

}
