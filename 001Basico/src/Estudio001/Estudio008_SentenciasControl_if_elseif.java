package Estudio001;

import java.util.Scanner;

public class Estudio008_SentenciasControl_if_elseif {

	public static void main(String[] args) {
		
		System.out.print("por favor introducir una nota: ");
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();

		if (nota < 5) {
			System.out.println("no pasas, sigue estudiando");
		} else if (nota == 5) {
			System.out.println("vas bien");
		}else {
			System.out.println("has aprobado");
			System.out.println("te compran el balon");
			
		}

	}

}
