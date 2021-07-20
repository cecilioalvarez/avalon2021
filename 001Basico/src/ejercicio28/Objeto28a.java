package ejercicio28;

import java.util.HashSet;
import java.util.Set;

public class Objeto28a {
	
	public static void main(String[] args) {
		Set<String> conjunto =new  HashSet<String>();
		conjunto.add("hola");
		conjunto.add("hola2");
		conjunto.add("hola3");
		conjunto.add("hola");
		
		for(String cadena:conjunto) {
			System.out.println(cadena);
		}
	}

}
