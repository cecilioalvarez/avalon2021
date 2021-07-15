package ejemplo16;

import java.util.ArrayList;

public class ManejoLista3 {
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
			System.out.println(numeros);
			//System.out.println(total);
		}
		System.out.println(numeros.get(5));
	}
}