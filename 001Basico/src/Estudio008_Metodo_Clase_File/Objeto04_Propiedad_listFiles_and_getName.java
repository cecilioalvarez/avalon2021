package Estudio008_Metodo_Clase_File;

import java.io.File;
import java.io.IOException;

public class Objeto04_Propiedad_listFiles_and_getName {

	public static void main(String[] args) throws IOException {

		File fichero = new File("carpeta01");
		
		if (fichero.isDirectory()) {
			//aca estamos trabajando con string o cadenas para obtener una lsita de los ficheros
			//aca trato con una lista de ficheros
			//con listFiles listo todos los ficheros dentro de una lsita
			// y ya puedo revisar las propiedades de las lsitas (ej:getName)
			//con este codigo solo salen las dos primerasa ramas de las carpetas.
			//si queisieramos sacar la tercera tendríamos que hacer un tercer if y asi sucesivamente
			File[] lista = fichero.listFiles();
			for (int i = 0; i < lista.length; i++) {
				System.out.println(lista[i].getName());
				
				if (lista[i].isDirectory()) {
					File[] lista2 = lista[i].listFiles();
					
					for (int j = 0; j < lista2.length; j++) {
						System.out.println(lista2[j].getName());
					}

				}

			}
		}

	}

}
