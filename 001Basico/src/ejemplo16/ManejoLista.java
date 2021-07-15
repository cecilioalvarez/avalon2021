package ejemplo16;

import java.util.ArrayList;

public class ManejoLista {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		
		for(int numero: numeros) {
			
			System.out.println(numero);
		}
	}
}
