package com.arquitecturajava.ejemplos25;

import java.io.File;
import java.io.IOException;

public class Objeto25 {
	public static void main(String[] args) {
		File fichero;
		try {
			fichero = new File("f:/mifichero");
			//lanza una excepcion
			//no se genera la excepcion de java io
			//una excepcion de null pointer
			lanzaError();
			//Nunca llega aqui
			fichero.createNewFile();
		}catch (IOException e) {
			System.out.println(e.getMessage());
			/*StackTraceElement[] elementos = e.getStackTrace();
			for(StackTraceElement elemento: elementos) {
				System.out.println(elemento);
			}*/
			e.printStackTrace();
		}finally {
			//siempre se ejecuta pase lo que pase
			System.out.println("se cierran los recursos");
		}
	}
	
	public static void lanzaError() {
		throw new NullPointerException("error basico");
	}
}
