package Ejemplo25b_GestionErrores_ClausulaFinally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Objeto27b {

	public static void main(String[] args) {

		//no le puedo cerrar porque no puedo acceder a el
		try {
			leerFicheroOtra();
			System.out.println("llega");


		} catch (Exception e) {

			System.out.println("ha fallado main :"+ e.getMessage());
		} finally {

		}

	}
	public static void leerFicheroOtra()  {

		leerFichero();
	}

	public static void leerFichero() {

		//no cerre aqui el fichero
		BufferedReader lector = null;
		try {
			String linea;
			//abierto el fichero
			lector = new BufferedReader(new FileReader("C:\\User\\boter\\git\\avalon2021\\001Basico\\src\\hola.txt"));
			while ((linea = lector.readLine()) != null) {
				//tienes algun problema por aqui dentro
				//aqui se genera una excepcion
				System.out.println(Integer.parseInt(linea));
			}
		}  catch (IOException e) {
			//ubicado aqui no tiene acceso al interface de ventanas
			//System.out.println("ha ocurrido un error"+ e.getMessage());
			//una excepcion sin chequear
			// convertido una excepcion chequeada en una sin chequear;
			throw new RuntimeException(e);

			//aqui has capturado la excepion
			//no has hecho nada
			// elfichero ni siquiera es distinto de null;

		}finally {
			System.out.println("clausula finally");
			if (lector!=null) {
				try {
					lector.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("pasa por finally y cierra los recursos");
			}
		}
	
		
		
	}

			}