package _003_Bucles;

public class Estudio012_Bucle_Brake_Continue3_SerieFibonacci {

	public static void main(String[] args) {

		// Se trata de una secuencia infinita de números naturales;
		// a partir del 0 y el 1, se van sumando a pares,
		// de manera que cada número es igual a la suma de sus dos anteriores

		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

		int x = 1;
		int anterior = 0;
		int temp;

		while (true) {

			System.out.print(x+",");
			temp = x;
			x = x + anterior;
			anterior = temp;
			if (x > 200) {
				break;
			}
		}

	}

}