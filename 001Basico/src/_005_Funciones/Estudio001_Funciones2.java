package _005_Funciones;

public class Estudio001_Funciones2 {

	public static void main(String[] args) {
		
		// para escribir una funcion rapidamente lo que hacemos es lo sigueinte
		// click derecho>refactor>Extract Method

		saludoDespedida();
		bye();
		saludoDespedida();
		bye();

	}

// con esta funcion podemos repetir las veces que sea el mensaje adios
	private static void bye() {
		mensaje("bye", 5);

	}

	private static void saludoDespedida() {
		System.out.println("hola como estas");
		System.out.println("muy bien y tu");
	}

	// aca se creo un repetidor para ser utilizado en la funcion de sacar el texto
	// bye
	private static void mensaje(String mensaje, int repeticiones) {

		for (int i = 0; i < repeticiones; i++) {
			System.out.println(mensaje);
		}
	}

}
