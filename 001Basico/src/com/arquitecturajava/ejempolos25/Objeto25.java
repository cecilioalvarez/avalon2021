package com.arquitecturajava.ejempolos25;

import java.io.File;
import java.io.IOException;

public class Objeto25 {
	public static void main(String[] args) {

		// yo se que este bloque debe ser controlado
		try {
			File fichero= new File("f:/mifichero");
			fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			StackTraceElement[] elementos= e.getStackTrace();
//			for (StackTraceElement elemento : elementos) {
//				System.out.println(elemento);
//			}
			e.printStackTrace();
		}
		
		
		
	}

}
