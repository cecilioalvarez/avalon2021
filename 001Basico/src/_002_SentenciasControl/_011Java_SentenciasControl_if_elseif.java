package _002_SentenciasControl;

import java.util.Scanner;

public class _011Java_SentenciasControl_if_elseif {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("por favor introducir una nota: ");
		int nota = sc.nextInt();

		if (nota < 5) {
			System.out.println("no pasas, sigue estudiando");
		}else if (nota == 5) {
			System.out.println("vas bien");
		}else {
			System.out.println("has aprobado");
			System.out.println("te compran el balon");	
		}

	}

}
