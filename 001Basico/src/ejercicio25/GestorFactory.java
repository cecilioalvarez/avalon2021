package ejercicio25;

public class GestorFactory {
	
	public static GestorDocumental getGestor(String tipo) {
		if(tipo.equals("wordpress")){
			return new GestorDocumentalWordpress();
		}else {
			return new GestorDocumentalWord();
		}
	}

}
