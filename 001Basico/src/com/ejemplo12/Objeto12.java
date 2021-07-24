package ejemplo12;

import java.util.ArrayList;
import java.util.Iterator;

public class Objeto12 {

	public static void main(String[] args) {
		
		ArrayList<String> lista= new ArrayList<String>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		lista.add("estas");
		lista.remove(0);
		lista.remove("estas");

		for (int i=0;i<lista.size();i++) {

			System.out.println(lista.get(i));
		}
		System.out.println("***************");


		Iterator<String> it= lista.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

		for (String cadena: lista) {
			System.out.println(cadena);
		}

		lista.forEach(System.out::println);
		
		

	}

}
