package Estudio008_Metodo_Clase_File;

//java importa la clase File, que es un Api de java
import java.io.File;
import java.io.IOException;

public class Objeto03_Propiedad_isDirectory_and_list {

	public static void main(String[] args) throws IOException {

//este nos dice si es o no un directorio, retornando un booleano
		File fichero=new File("carpeta01");
		System.out.println(fichero.isDirectory());
// la propiedad list de fichero nos permite lsitar los ficheros de la carpeta
		if (fichero.isDirectory()) {
			String[] ficheros=fichero.list();
			for(int i=0;i<ficheros.length;i++) {
				System.out.println(ficheros[i]);
			}
		}
		

	}

}
