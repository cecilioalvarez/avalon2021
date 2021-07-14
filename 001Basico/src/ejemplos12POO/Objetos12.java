package ejemplos12POO;

import java.util.ArrayList;
import java.util.Iterator;

public class Objetos12 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas?");
		
		lista.remove(0);
		lista.remove("que");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------");
		
		Iterator <String> it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
