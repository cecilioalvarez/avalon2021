package EstudioFunciones;

public class Funciones {

	public static void main(String[] args) {
		
		System.out.println("hola como estas");
		System.out.println("muy bien y tu");
		System.out.println("bye");
		System.out.println("bye");
		System.out.println("hola como estas");
		System.out.println("muy bien y tu");

		System.out.println("____________________");
		// lo anterior se puede ajustar utilizando funciones
		// el ejemplo siguiente nos muestra como podemos asignar 
		//una funcion a una linea de codigo

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
