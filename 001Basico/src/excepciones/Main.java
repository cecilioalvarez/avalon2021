package excepciones;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File fichero;
		try {
			fichero = new File("f:/mifichero");
			lanzaError();
			fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			StackTraceElement[] elemntos = e.getStackTrace();
			for (StackTraceElement stackTraceElement : elemntos) {
				System.out.println(stackTraceElement);
			}
			
		} finally {
			//siempre se ejecuta, pase lo que pase
			System.out.println("Se cierran los recursos");
		}
	}
	
	public static void lanzaError() {
		throw new NullPointerException("error bascio");
	}

}
