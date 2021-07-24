package Estudio001;

import java.util.Scanner;

public class Estudio010_OperadoresLogicos_and_or {

	public static void main(String[] args) {
		
		System.out.print("por favor introducir una nota: ");
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();

		if (nota < 0 || nota > 10) {
			System.out.println("datos invalidos");
		}else if (nota >= 0 && nota < 5) {
			System.out.println("no pasas, sigue estudiando");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("vas bien");
		}else if (nota >= 7 && nota < 9){
			System.out.println("has aprobado y te ganas un balon");			
		}else
			System.out.println("has aprobado y te ganas un movil");

	}

}
