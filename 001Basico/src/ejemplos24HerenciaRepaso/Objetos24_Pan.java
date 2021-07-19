package ejemplos24HerenciaRepaso;

public class Objetos24_Pan {

	public static void main(String[] args) {

		//Opcion1 de Factory
		//Pan mipan = PanFactory.getPan("baggette", 1, "Harina Fina");

		//Opcion2 Factory
		Pan mipan = PanFactory.getPan("baggette");
		
		mipan.cocer();
	}

}
