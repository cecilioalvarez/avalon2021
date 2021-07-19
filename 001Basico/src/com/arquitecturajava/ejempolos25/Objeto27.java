package com.arquitecturajava.ejempolos25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Objeto27 {

	public static void main(String[] args) {

		//no le puedo cerrar porque no puedo acceder a el
		try {
			leerFichero();
			
		} catch (Exception e) {
			System.out.println("ha fallado main :"+ e.getMessage());
		} finally {

		}

	}

	public static void leerFichero() throws IOException {

		//no cerre aqui el fichero
		BufferedReader lector = null;

		try {
			String linea;
			//abierto el fichero
			lector = new BufferedReader(new FileReader("/User/cecilioalvarezcaules/git/repository2/001Basico/hola.txt"));

			while ((linea = lector.readLine()) != null) {
				//tienes algun problema por aqui dentro
				//aqui se genera una excepcion
				System.out.println(Integer.parseInt(linea));
			}
		}  catch (IOException e) {
			//ubicado aqui no tiene acceso al interface de ventanas
			//System.out.println("ha ocurrido un error"+ e.getMessage());
			throw e;
			//aqui has capturado la excepion
			//no has hecho nada
			// elfichero ni siquiera es distinto de null;
			
		}finally {
			
			if (lector!=null) {
				lector.close();
				System.out.println("pasa por finally y cierra los recursos");
			}
		}
	
		
		

	}
}
