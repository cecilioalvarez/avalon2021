package _002_SentenciasControl;

import java.util.Scanner;

public class _010Java_SentenciasControl_If3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce otro numero");
		int numero2 = sc2.nextInt();
		
		if (numero > numero2) {
			System.out.println("El numero mayor es: " + numero);
		} else {
			System.out.println("El numero mayor es: " + numero2);

		}
		
		System.out.println("_______________________________");
		
		int numero3=2;
		if (numero3==2 || numero3==4 || numero3==6 || numero3==8) {
			System.out.println("el numero es par");
		}
		
		//el % se utiliza para sacar el residio entre dos numeros
		if (numero3 % 2==0) {
			System.out.println(numero3);
		}
		
	}

}