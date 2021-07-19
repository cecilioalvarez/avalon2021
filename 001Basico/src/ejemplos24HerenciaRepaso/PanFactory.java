package ejemplos24HerenciaRepaso;

import ejemplos23InterfacesFactory.GestorDocumental;
import ejemplos23InterfacesFactory.GestorDocumentalWord;
import ejemplos23InterfacesFactory.GestorDocumentalWordpress;

public class PanFactory {

	//Opcion 1
	/*public static Pan getPan(String tipo,int peso,String ingrediente) {
		
		if (tipo.equals("baggette")) {
			return new Baggette(peso,ingrediente);
		}else if(tipo.equals("torta")){
			return new Torta(peso,ingrediente);
		}else {
			return new Pan(peso,ingrediente); 
		}
	}*/
	//Opcion2
	public static Pan getPan(String tipo) {
		
		if (tipo.equals("baggette")) {
			return new Baggette(1,"Harina fina");
		}else if(tipo.equals("torta")){
			return new Torta(2,"Masa madre");
		}else if(tipo.equals("integral")){
			return new PanIntegral(2,"Semillas");
		}else {
			return new Pan(3,"Centeno"); 
		}
	}
}
