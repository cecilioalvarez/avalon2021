package com.arquitecturajava.ejempolos25;

import java.io.File;
import java.io.IOException;

public class Objeto26 {

	public static void main(String[] args) {

		//no hace falta poner un try catch
		try {
			lanzarError();
		} catch (IOException e) {
			System.out.println("ojo esto salen en una ventana");
			System.out.println("el fichero da error:" +e.getMessage());
		}finally {
			
			System.out.println("cerrando recursos");
		}
		
		
		
	}

	// que este método este en una claes
	// y sea clase no tenga acceso al interface de usuario
	
	public static void lanzarError() throws IOException  {

		//nos estariamos merendando el error
		File fichero = null;
		

			try {
				fichero= new File("f:/mifichero");
				// se produce un error
				fichero.createNewFile();
			} catch (IOException e) {
				throw e;
			}finally {
				
				System.out.println("cerrando recursos "+ fichero.getName());
			}
	
		
	}
}
