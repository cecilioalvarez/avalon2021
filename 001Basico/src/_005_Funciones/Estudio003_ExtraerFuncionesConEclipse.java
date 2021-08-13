package _005_Funciones;

public class Estudio003_ExtraerFuncionesConEclipse {

	public static void main(String[] args) {

		// podemos rapidamente construir un metodo o funcion con eclipese
		// esto lo pdoemos hacer en eclipse
		// seleccionamos lo que se repite>click derecho>Refactor>Extract Method
		//damos un nombre y listo

		saludo();
		bye();
		saludo();

	}

	private static void bye() {
		System.out.println("bye");
		System.out.println("bye");
	}

	static void saludo() {
		System.out.println("hola como estas");
		System.out.println("muy bien y tu");
	}
}