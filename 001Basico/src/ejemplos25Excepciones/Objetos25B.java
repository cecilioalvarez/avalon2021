package ejemplos25Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Objetos25B {

	public static void main(String[] args) {
		
		/*try {
			lanzarError();
		} catch (IOException e) {
			System.out.println("Esto sale en una ventana");
			System.out.println("Error de fichero: "+e.getMessage());
		}*/
		
		//Aqui no puedo cerrar fichero porque no puedo acceder al fichero
		try {
			leerFichero();
		} catch (Exception e) {
			System.out.println("Ha fallado: "+e.getMessage());
		} finally {

		}

	}
	
	//Este metodo podría estar en una clase sin acceso a Interfaz de usuario
	
	public static void lanzarError() throws IOException {
		//Opcion con trycatch 
		/*try {
			File fichero = new File("f:/mifichero");
			
			fichero.createNewFile();
		} catch (IOException e) {
			System.out.println("Error de fichero: "+e.getMessage());
		}*/
		//Opcion 2 es con throws IOException
		File fichero = new File("f:/mifichero");
		
		fichero.createNewFile();
		
	}
	
	public static void lanzarErrorVersionCompleta() throws IOException {
		File fichero=null; 
		try {
			fichero= new File("f:/mifichero");
			
			fichero.createNewFile();
		} catch (IOException e) {
			throw e;
		}finally {
			System.out.println("Cerrando fich "+fichero.getName());
		}
		
	}
	
		
	public static void leerFichero() throws IOException {

		BufferedReader lector = null;

		try {
			String linea;

			lector = new BufferedReader(new FileReader("C:\\Users\\migue\\Desktop\\CursoAVALON\\ZoomInfo.txt"));

			while ((linea = lector.readLine()) != null) {

				System.out.println(linea);
			}
		} 
		//Exception es clase padre de todas las excepciones
		catch (Exception e) {
			/*e.printStackTrace();
			System.out.println("Pasa por catch");*/
			throw e;
			
			//Convesion de excepcion chequeada en No chequeada pudiendo quitar los throws de los metodos
			//throw new RuntimeException(e);
		}finally {
			if (lector!= null) {
				lector.close();
				System.out.println("Pasa por finally cerrando recursos");
			}
			System.out.println("Pasa por finally");
		}
		

	}


}
