package Ejemplo13;

import java.util.ArrayList;


public class Objetos13 {

	public static void main(String[] args) {
		ArrayList<Nota> notas=new ArrayList<Nota>(); 
		notas.add(new Nota("Mates",9));
		notas.add(new Nota("Lengua",4));
		notas.add(new Nota("Fisica",5));
		notas.add(new Nota("Ingles",10));
		
		int notamax=-1;
		int suma=0;
		for (Nota nota : notas) {
			suma = suma+nota.getNota();
			if (nota.getNota()>notamax) {
				notamax=nota.getNota();
			}
		}
		System.out.println(notamax);
		System.out.println(suma);
	}

}
