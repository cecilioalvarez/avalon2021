package _005b_LeerArchivosTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Textos {

	public void leer(String nombreArchivo) {
		
		//el uso de estas clases genera unos errores, por lo que debemos 
		//ingresar un try y un catch
		try {

			FileReader r = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(r);

			// con el sigueinte codigo solo se lee una sola linea
			// System.out.println(buffer.readLine());
			// si quisiera leer todas las lineas debo utilizar un bucle

			String linea = "";

			while (linea != null) {
				linea = buffer.readLine();
				if (linea == null) {
					break;
				}
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
