package com.arquitecturajava.ejempolos25;

import java.io.File;
import java.io.IOException;

public class Objeto25 {
	public static void main(String[] args) {

		// yo se que este bloque debe ser controlado
		File fichero;
		try {
			fichero = new File("f:/mifichero");
			// lanza una excepcion
			// nose genera la excepcion de java io
			// una excepcion de null pointer
			lanzaError();
			fichero.createNewFile();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			StackTraceElement[] elementos= e.getStackTrace();
//			for (StackTraceElement elemento : elementos) {
//				System.out.println(elemento);
//			}
			e.printStackTrace();
		} finally {
			// siempre se ejecutan pase lo que pase
			System.out.println("se cierran los recursos");
		}

	}
	
	public static void lanzaError() {
		
		throw new NullPointerException("error basico");
	}

}
