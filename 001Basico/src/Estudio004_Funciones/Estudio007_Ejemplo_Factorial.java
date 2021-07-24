package Estudio004_Funciones;

public class Estudio007_Ejemplo_Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));	
		System.out.println(factorial(10));

	}

	static int factorial(int numero) {
		int factorial =1;
		for (int i = 1; i <= numero; i++) {
			factorial=factorial*i;
		}
	return factorial;
	}
	
}
