//Suma de resultados de array
package ejemplo16;

import java.util.ArrayList;

public class ManejoLista {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(5);
		numeros.add(13);
		numeros.add(15);
		numeros.add(21);
		numeros.add(4);
		numeros.add(3);
		int total = 0;
		for (int numero : numeros) {
			total += numero;

			System.out.println(total);
		}
		int max = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > max) {
				max = numeros.get(i);
			}
			System.out.println("Máximo" + max);
		}
		
	}

}
