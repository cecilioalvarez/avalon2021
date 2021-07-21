package Ejemplo25_GestionErrores;

import java.io.File;
import java.io.IOException;

public class Objeto25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File fichero=new File("f:/mifichero");
			fichero.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			//de esta forma sale mas bonito
			StackTraceElement[] elementos=e.getStackTrace();
			for (StackTraceElement elemento: elementos) {
				System.out.println(elemento);
			}
			//de esta forma el error sale mas feo
			//e.printStackTrace();
		}
		

	}

}
