package Estudio001;

import java.util.Scanner;

public class Estudio003a_ClaseScanner {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("por favor introducir valor: ");
		int valor = sc.nextInt();
		System.out.println(valor*2);
	}

}
