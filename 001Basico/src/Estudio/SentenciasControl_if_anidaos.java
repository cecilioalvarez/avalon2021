package Estudio;

import java.util.Scanner;

public class SentenciasControl_if_anidaos {

	public static void main(String[] args) {
		
		boolean oferta=true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("por favor introducir una nota: ");
		int nota = sc.nextInt();
		
		
		if (nota < 0 || nota > 10) {
			System.out.println("datos invalidos");
		}else if (nota >= 0 && nota < 5) {
			System.out.println("no pasas, sigue estudiando");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("vas bien");
		}else if (nota >= 7 && nota < 9){
			System.out.println("has aprobado y te ganas un balon");
			
			System.out.print("estamos en oferta???");
			oferta = sc.nextBoolean();
			if (oferta==true) {
				System.out.println("con camisa favorita");
			}
		
		}else {
			System.out.println("has aprobado y te ganas un movil");
			
			System.out.print("estamos en oferta???");
			oferta = sc.nextBoolean();
			//if (oferta==true) { para hacerlo mas compacto podemos colocar como esta abajo 
			if (oferta) {
				System.out.println("con auricualares");
			}
			
		}
	}

}
