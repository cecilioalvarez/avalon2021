package Estudio004_Funciones;

public class Estudio003_ImportarFuncionconEclipse {

	public static void main(String[] args) {

		// podemos traer la funcion que tenemos en otra clase
		// esto lo pdoemos hacer en eclipse
		// seleccionamos lo que se repite>click derecho>Refactor>Extract Method

		saludo();
		System.out.println("bye");
		System.out.println("bye");
		saludo();

	}

	static void saludo() {
		System.out.println("hola como estas");
		System.out.println("muy bien y tu");
	}
}