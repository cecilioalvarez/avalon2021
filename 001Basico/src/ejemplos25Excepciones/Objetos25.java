package ejemplos25Excepciones;

import java.io.File;
import java.io.IOException;

public class Objetos25 {

	public static void main(String[] args) {
		
		try {
			File fichero = new File("f:/mifichero");
			
			fichero.createNewFile();
			//Si se lanza antes de lanzar error que fichero.create, nunca se llega
			//
			lanzarError();
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			//es lo mismo que e.printStackTrace()
			/*StackTraceElement[] elems = e.getStackTrace();
			for (StackTraceElement stackTraceElement : elems) {
				System.out.println(stackTraceElement);
			}*/
		}finally {
			System.out.println("Se cierran los recursos");
		}

	}
	
	public static void lanzarError() {
		throw new NullPointerException("Error de Null");
	}

}
