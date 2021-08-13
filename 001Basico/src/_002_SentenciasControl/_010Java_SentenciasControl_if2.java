package _002_SentenciasControl;

import java.util.Scanner;

public class _010Java_SentenciasControl_if2 {

	public static void main(String[] args) {

		int nota1 = 5;
		int nota2 = 7;

		System.out.println(nota1 > nota2);
		System.out.println("_____________________________");

		Scanner sc = new Scanner(System.in);
		System.out.println("por favor introducir nota: ");
		int nota3 = sc.nextInt();

		if (nota3 >= 5) {
			System.out.println("has aprobado");
			System.out.println("te compran el balon");
		} else {
			System.out.println("no pasas");
		}

	}

}
