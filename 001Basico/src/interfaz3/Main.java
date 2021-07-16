package interfaz3;

public class Main {
	public static void main(String[] args) {
		Documento d = new Documento(1, 1, "Este es el texto");
		GestorDocumental gd = new GestorDocumental();
		gd.salvar(d);
		gd.versionar(d);
	}

}
