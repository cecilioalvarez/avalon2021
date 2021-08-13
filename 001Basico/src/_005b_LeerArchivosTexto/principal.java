package _005b_LeerArchivosTexto;

public class principal {

	public static void main(String[] args) {
		
		Textos t=new Textos();
		t.leer("database/hola.txt");
		
		Textos t1=new Textos();
		t1.leer("database/database.properties");

	}

}
