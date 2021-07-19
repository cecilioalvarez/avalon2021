package com.arquitecturajava.ejemplos25;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Objeto26 {

	public static void main(String[] args) {

		
		try {
			leerFichero();
		} catch (Exception e) {
			System.out.println("ha fallado main: " + e.getMessage());
			} finally {

			}

	}



	public static void leerFichero() throws IOException {

		BufferedReader lector = null;

		String linea;

		try {
			lector = new BufferedReader(new FileReader("C:\\Users\\Ruben\\git\\avalon2021\\001Basico\\hola.txt"));

			while ((linea = lector.readLine()) != null) {
				//tienes algun problema por aqui dentro
				//aqui se genera una excepcion
				System.out.println(Integer.parseInt(linea));
			}
		} catch (IOException e) {
			throw e;
			//aqui has capturado la excepcion
			//no has hecho nada
			//el fichero ni siquiera es distinto de null
		}finally {
			if(lector!=null) {
				lector.close();
				System.out.println("pasa por finally y cierra los recursos");
			}
		}
	

	}
}


