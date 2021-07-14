package ejercicio13;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota("mates",5));
		notas.add(new Nota("lengua",8));
		notas.add(new Nota("historia",7));
		notas.add(new Nota("bio",10));
		
		for (Nota nota : notas) {
			System.out.println(nota.getValor());
		}
		
	}

}
