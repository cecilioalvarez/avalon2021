package com.arquitecturajava;

import java.util.Scanner;

public class HolaMundo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Dame una Nota:");
		int num = 0;
		while(num>=0) {
			System.out.println("Dame una Nota:");
			num = sc.nextInt();
			if (num>4 && num <7) {
				System.out.println("Has Aprobado");
			}else if(num >=5 && num <9){
				System.out.println("Notable");
			}else if(num >=9){
				System.out.println("Sobresaliente");
			}else {
				System.out.println("Has Suspendido");
			}
				System.out.println("--------------------");
		}
		
		
	}
}
