package Ejemplos30;

import java.util.ArrayList;
import java.util.List;

public class Objetos30 {

	public static void main(String[] args) {
		List<String> lista=new ArrayList<>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		
		for (String cadena:lista) {
			System.out.println(cadena);
		}
		Integer numero=Integer.valueOf(5);
		String numero2="7";
		
		int numero3= Integer.parseInt(numero2);
		System.out.println(numero3+1);
		String cadenaFinal=Integer.toString(9);
		System.out.println(cadenaFinal);
		
		// Una lista de objeto
		List<Integer> lista2=new ArrayList<>();
		lista2.add(Integer.valueOf(5));
		lista2.add(5);
		
		for (int n:lista2)
			System.out.println(n);
	}

}
