package Estudio008_Metodo_Clase_File;

//java importa la clase File, que es un Api de java
import java.io.File;
import java.io.IOException;

public class Objeto01_Propiedad_createNewFile_and_mkdir {

	public static void main(String[] args) throws IOException {


		//vamos a crear una clase del Api de java para utilizar uno de sus metodos
		//y crear un fichero en disco
		File fichero=new File("brueba.txt");
		File fichero2=new File("brueba2.txt");
		File fichero3=new File("brueba3.txt");
		File fichero4=new File("brueba4.txt");
		//esto incialmente da un error, pero se hace un llamado a la clase IOException 
		//para que se haga una gestion de los errores y pueda correr el programa
		fichero.createNewFile();
		fichero2.createNewFile();
		fichero3.createNewFile();
		fichero4.createNewFile();
		
		//ahora vamos a crear una carpeta
		File directorio=new File("carpeta01");
		File directorio2=new File("carpeta02");
		directorio.mkdir();
		directorio2.mkdir();
		
		

	}

}
