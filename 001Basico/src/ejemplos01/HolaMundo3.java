package ejemplos01;

import java.util.Scanner;

public class HolaMundo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Dame una Nota:");
		int num = 0;
		while(num>=0) {
			System.out.println("Dame una Nota:");
			num = sc.nextInt();
			if (num>4) {
				System.out.println("Has Aprobado");
			}else {
				System.out.println("Has Suspendido");
			}
				System.out.println("--------------------");
		}
		
	}
}
