package Ejemplo25;

import java.io.File;
import java.io.IOException;

public class Objeto26 {
	public static void main(String[] args) {
		try {
			lanzarError();
		} catch (IOException e){
			System.out.println("el fichero da error:" +e.getMessage());
		} finally {
			System.out.println("cerrando");
		}
	}
	public static void lanzarError() throws IOException {
		File fichero = new File("f:/mifichero");
		try {
			fichero.createNewFile();
		} catch (IOException e) {
			throw e;
		} finally {
			System.out.println("cerrando recursos " + fichero.getName());
			//System.out.println("cerrando recursos");
		}
	}
}
