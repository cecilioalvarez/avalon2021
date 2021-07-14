package ejemplos13POO;

import java.util.ArrayList;

public class Objetos13 {

	public static void main(String[] args) {

		ArrayList<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota("mate", 5));
		notas.add(new Nota("lengua", 6));
		notas.add(new Nota("ingles", 2));
		notas.add(new Nota("fisica", 10));
		
		int suma=0;
		Nota notaMax=new Nota("",0);
		
		for (Nota nota : notas) {
			
			if (nota.getValor()>notaMax.getValor()) {
				notaMax=nota;
			}
			
			System.out.println(nota.getValor());
			suma+=nota.getValor();
		};

		System.out.println("La suma de Notas: "+suma);
		System.out.println("La Media de Notas: "+suma/notas.size());
		System.out.println("La Nota Maxima: "+notaMax.getValor());
		System.out.println(notaMax);
		
	}

}
