package excepciones2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		try {
			File fichero = new File("f:/mifichero");
			fichero.createNewFile();
			leerFichero();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de fichero " + e.getMessage());
			System.out.println("Error de fichero " + e.getCause());

			System.out.println("Ha fallado");
		}

	}

	public static void lanzaError() throws IOException {

		File fichero = new File("f:/mifichero");
		fichero.createNewFile();

	}

	public static void leerFichero() throws IOException {

		BufferedReader lector = null;

		try {
			String linea;

			lector = new BufferedReader(
					new FileReader("/Users/cecilioalvarezcaules/git/repository2/001Basico/hola.txt"));

			while ((linea = lector.readLine()) != null) {

				System.out.println(linea);
			}
		} catch (IOException e) {
			// Aqui has capturado la excepcion
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (lector != null) {
				// Si el fichero no existe o es nulo, nunca llegará aqui
				lector.close();
			}
		}
		// Si el fichero no existe o es nulo, nunca llegará aqui
		// lector.close();

	}

}
