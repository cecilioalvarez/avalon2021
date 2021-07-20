package Ejemplo25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Objeto27 {

	public static void main(String[] args) {

		try {
			leerFicheroOtra();
			System.out.println("llega");

		} catch (SuperFicheroExcepcion e) {

			System.out.println("ha fallado main :" + e.getMessage());
			System.out.println("ha fallado main :" + e.getClass());

		} finally {
			System.out.println("Finalizamos");
		}

	}

	public static void leerFicheroOtra() {

		leerFichero();
	}

	public static void leerFichero() {

		BufferedReader lector = null;

		try {
			String linea;
			lector = new BufferedReader(
					new FileReader("/User/cecilioalvarezcaules/git/repository2/001Basico/hola.txt"));

			while ((linea = lector.readLine()) != null) {
				System.out.println(Integer.parseInt(linea));
			}
		} catch (IOException e) {

			throw new SuperFicheroExcepcion(e);

		} finally {
			System.out.println("clausula finally");
			if (lector != null) {
				try {
					lector.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("pasa por finally y cierra los recursos");
			}
		}

	}
}