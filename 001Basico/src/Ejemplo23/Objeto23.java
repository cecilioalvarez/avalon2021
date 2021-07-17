package Ejemplo23;

public class Objeto23 {
	public static void main(String[] args) {

		Documento d= new Documento(1,"hola esto es texto",1);

		//Patron de factoria para crear los diferentes gestores de documentos
		// el que usa el programa no sabe cuantos tipos de gestores exdisten

		GestorDocumental gd= new GestorDocumentalWord();
		gd.salvar(d);
		gd.versionar(d);

		GestorDocumental gd1= new GestorDocumentalWordpress();
		gd1.salvar(d);
		gd1.versionar(d);

	}
	}