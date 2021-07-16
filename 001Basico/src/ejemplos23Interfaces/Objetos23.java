package ejemplos23Interfaces;

public class Objetos23 {

	public static void main(String[] args) {
		Documento d = new Documento(1, 0, "textp");
		//Patron de factoria para crear los diferentes gestores de documento
		
		GestorDocumental gd = new GestorFactory().getGestor("word");
		
		gd.salvar(d);
		gd.versionar(d);
		
        GestorDocumental gdwp = new GestorFactory().getGestor("wordpress");
		
        gdwp.salvar(d);
        gdwp.versionar(d);

	}

}
