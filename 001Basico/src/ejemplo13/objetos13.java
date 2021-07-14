package ejemplo13;

import java.util.ArrayList;

public class objetos13 {
	public static void main(String[] args) {
		
		
		ArrayList<Nota> notas= new ArrayList<Nota>();
		notas.add(new Nota("mates",5));
		notas.add(new Nota("fisica",6));
		notas.add(new Nota("lengua",8));
		notas.add(new Nota("quimica",9));
		
		for (Nota nota : notas) {
			
			System.out.println(nota.getValor());
		}
	
	}
}
