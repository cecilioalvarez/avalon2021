package Estudio008_Metodo_Clase_File;

import java.io.File;
import java.io.IOException;

public class Objeto05_Recursividad_EjemploCarpetas {

	public static void main(String[] args) throws IOException {

		File fichero = new File("carpeta01");
		mostrarCarpeta(fichero);
				
	}
	
	// una funcion recursiva que se llame a si misma
	//recordar que todos los metodos del main son estaticos
	public static void mostrarCarpeta (File fichero) {
		if (fichero.isDirectory()) {
			File[] lista = fichero.listFiles();
			for (int i = 0; i < lista.length; i++) {
				System.out.println(lista[i].getName());
				if (lista[i].isDirectory()) {
					mostrarCarpeta(lista[i]);
				}
			}
		}
	}

}
