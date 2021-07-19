package Ejemplo25;

import java.io.File;
import java.io.IOException;

public class Objeto26 {
	public static void main(String[] args) {
		
	}
	public static void lanzarError() {
		try {
			File fichero = new File("f:/mifichero");
			fichero.createNewFile();
		} catch (IOException e) {
			System.out.println("error de fichero:" +e.getMessage());
		}
	}
}
