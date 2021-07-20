package ejemplos30_Wrappers_ClasesCoraza;

import java.util.ArrayList;
import java.util.List;

public class Objetos30 {

	public static void main(String[] args) {

		//wrapper o clases coraza sobre tipos básicos
		
		List<String> lista = new ArrayList<>();
		
		lista.add("hola");
		lista.add("que");
		lista.add("tal");
		
		for (String cadena : lista) {
			System.out.println(cadena);
		}
		
		Integer num = Integer.valueOf(5);
		
		String num2="7";
		int num3=Integer.parseInt(num2);
		System.out.println(num3+1);
		String cadenaFinal= Integer.toString(9);
		System.out.println(cadenaFinal+1);
		
		//No puede ser lista de int, debe usarse el wrapper Integer
		List<Integer> listaNums = new ArrayList<>();
		listaNums.add(1);
		listaNums.add(Integer.valueOf(5));
		
		for(int n:listaNums) {
			System.out.println(n);
		}
		
		
	}

}
