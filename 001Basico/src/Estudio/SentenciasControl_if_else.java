package Estudio;

import java.util.Scanner;

public class SentenciasControl_if_else {

	public static void main(String[] args) {

		int nota1 = 5;
		int nota2 = 7;

		System.out.println(nota1 > nota2);
		System.out.println("_____________________________");

		System.out.println("por favor introducir nota: ");
		Scanner sc = new Scanner(System.in);
		int nota3 = sc.nextInt();

		if (nota3 >= 5) {
			System.out.println("has aprobado");
			System.out.println("te compran el balon");
		} else {
			System.out.println("no pasas");
		}

	}

}
