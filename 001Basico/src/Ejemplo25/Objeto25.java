package Ejemplo25;

import java.io.File;
import java.io.IOException;

public class Objeto25 {
	public static void main(String[] args) {
		try {
			File fichero = new File("f:/mifichero");
			// fichero.createNewFile();
			// throw new IOException ("el fichero falló");
			// throw new NullPointerException ("ha ocurrido una excepcion");
			lanzaError();
			
			// no llegamos
			fichero.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
			// System.out.println("hola");
		} finally {
			System.out.println("se cierran los recursos");
		}
	}

	public static void lanzaError() {

		throw new NullPointerException("error basico");
	}
}
