package Estudio;

import java.util.Scanner;

public class LeerDatoPantalla2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("por favor introducir valor: ");
		int valor = sc.nextInt();
		System.out.println(valor*2);
	}

}
