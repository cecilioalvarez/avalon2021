package _005_Funciones;

public class Estudio007_Ejemplo_FactorialRecursivo {

	public static void main(String[] args) {

		//System.out.println(factorial(5));
		//System.out.println(factorial(10));
		
		System.out.println(factorialRecursivo(5));
		System.out.println(factorialRecursivo(10));

	}

	// ahora lo que queremos es sacar el factorial pero de forma recursiva
	// que quiere decir esto: 5*factorial de 4, 4 factorial de 3, 3 factorial de 2,
	// 2 factorial de 1

	static int factorialRecursivo(int numero) {
		// 5 por el factorial de 4
		// 5x4xfactialial de 3
		// 5x5x3x factorial de 2
		// 5x4x3x2x factorial de 1
		// normalmente usamosn una funcion recursiva cuando los bucles for y while se quedan cortas
		if (numero == 1) {
			return numero;
		}
		return numero * factorialRecursivo(numero - 1);
	}
}