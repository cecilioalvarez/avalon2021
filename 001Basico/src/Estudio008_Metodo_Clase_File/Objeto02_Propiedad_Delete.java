package Estudio008_Metodo_Clase_File;

//java importa la clase File, que es un Api de java
import java.io.File;
import java.io.IOException;

public class Objeto02_Propiedad_Delete {

	public static void main(String[] args) throws IOException {


		File fichero=new File("brueba.txt");
		fichero.delete();
		
		File directorio=new File("carpeta01");
		directorio.delete();
		
		

	}

}
