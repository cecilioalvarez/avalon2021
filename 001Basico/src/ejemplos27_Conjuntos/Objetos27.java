package ejemplos27_Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Objetos27 {

	public static void main(String[] args) {
		
		Set<String> conjunto= new HashSet<String>();
		
		conjunto.add("hola");
		conjunto.add("hola2");
		//No permite duplicados por eso el tamaño es 2
		conjunto.add("hola");
		
		for (String cadena : conjunto) {
			System.out.println(cadena);
		}
		System.out.println(conjunto.size());

	}

}
