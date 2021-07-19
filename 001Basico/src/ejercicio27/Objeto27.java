package ejercicio27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Objeto27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			leerFichero();
			
		} catch (IOException e) {
			System.out.println("ha fallado");
		}
		
		

	}
	
	public static void leerFichero() throws IOException {
		BufferedReader lector=null;
		try {
			String linea;
			lector=new BufferedReader(new FileReader("F:/fichero.txt"));
			while((linea=lector.readLine())!=null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lector.close();
		}
		
		
	}

}
