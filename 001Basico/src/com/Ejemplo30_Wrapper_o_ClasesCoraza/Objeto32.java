package Ejemplo30_Wrapper_o_ClasesCoraza;

import java.util.ArrayList;
import java.util.List;


public class Objeto32 {

	public static void main(String[] args) {

		//wrapper o clases coraza sobre los tipos básicos del lenguaje

		List<String> lista= new ArrayList<>();
		lista.add("hola");
		lista.add("que");
		lista.add("tal");

		for (String cadena: lista) {
			System.out.println(cadena);
		}
		//clase coraza sobre el tipo o (Wrapper)

		Integer  numero= Integer.valueOf(5);
		String numero2="7";

		int numero3= Integer.parseInt(numero2);
		System.out.println(numero3+1);
		String cadenaFinal= Integer.toString(9);
		System.out.println(cadenaFinal);


		//una lista de objetos pero soporta que le pasemos 
		// tipos basicos
		List<Integer> lista2= new ArrayList<>();
		lista2.add(Integer.valueOf(5));
		lista2.add(5);

		for (int n: lista2) {
			System.out.println(n);
		}

	}
}