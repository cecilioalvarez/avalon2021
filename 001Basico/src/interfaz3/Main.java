package interfaz3;

public class Main {
	public static void main(String[] args) {
		Documento d= new Documento(1,"hola esto es texto",1);
		GestorDocumentalWord gd= new GestorDocumentalWord();
		gd.salvar(d);
		gd.versionar(d);
		
		GestorDocumental gd1 = new GestorDocumentalWordpress();
		gd1.salvar(d);
		gd1.versionar(d);
	}

}
