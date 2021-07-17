package Estudio001;

import java.util.Scanner;

public class Estudio003_ClaseScanner {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("por favor introducir nota: ");
		int nota = sc.nextInt();
		System.out.println("la nota introducida es " + nota);
				
		Scanner sc2= new Scanner(System.in);
		System.out.print("introducir otro numero: ");
		int nota2 = sc2.nextInt();
		System.out.println("la nota segunda es " + nota2);
		
		System.out.print("la multiplicacion es :" + nota*nota2);
	}

}
