package _001_Introduccion;

import java.util.Scanner;

public class _005Java_Clase_Scanner {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("por favor introducir nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("la nota introducida es " + nota1);
				
		Scanner sc2= new Scanner(System.in);
		System.out.print("introducir otra nota: ");
		int nota2 = sc2.nextInt();
		
		
		System.out.println("la segunda nota es " + nota2);
		
		System.out.println("el producto de las notas es: " + nota1*nota2);
		
		System.out.println("_________________________________________________________");
		
		Scanner sc3= new Scanner(System.in);
		System.out.print("por favor introducir valor: ");
		int valor = sc3.nextInt();
		System.out.println(valor*2);
		
	}

}
