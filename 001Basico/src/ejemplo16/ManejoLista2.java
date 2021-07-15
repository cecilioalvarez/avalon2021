//suma de resultados de un array
package ejemplo16;

import java.util.ArrayList;

public class ManejoLista2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		int total=0;
		for(int numero: numeros) {
			
			total+=numero;
		}
		System.out.println(total);
	}
}
