package _003_Bucles;

import java.util.Scanner;

public class Estudio003_Bucle_For_Tabla_Multiplicar {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("¿que tabla de multiplicar quiere?");
		int tabla = sc.nextInt();
		
		for (int numero=0;numero<=10;numero++) {
			System.out.println(tabla + " * " + numero + " es igual a " + numero*tabla);
		}
	}

}
