package ejercicio13;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota("mates",5));
		notas.add(new Nota("lengua",8));
		notas.add(new Nota("historia",7));
		notas.add(new Nota("bio",10));
		
		int resultado = 0;
		int asignatura = 0;
		ArrayList<Integer> notamasAlta = new ArrayList<Integer>();
		
		for (Nota nota : notas) {
			System.out.println(nota.getValor());
			resultado += nota.getValor();
			notamasAlta.add(nota.getValor());	
			
		}
	 
		double media = resultado/notas.size();
		System.out.println("La media es "+ media);
		Collections.sort(notamasAlta);
		System.out.println("La nota mas alta es " + notamasAlta.get(notamasAlta.size()-1));
		
		
		//Forma cecilio
		Nota mayor = new Nota ("lengua", 0);
		for ( Nota nota : notas) {
			if (mayor.getValor() < nota.getValor()) {
				mayor = nota;
			}
			
		}
		System.out.println(mayor.getValor());
	}

}
