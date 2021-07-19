package com.arquitecturajava.ejemplos24;

public class FactoriaPan {

	public static Pan getPan(String tipo) {
		
		
		
		if (tipo.equals("baggete")) {
			return new Baggete(1,"harina fina");
		}else if (tipo.equals("integral")) {
			return new PanIntegral(2, "centeno");
		}else {
			
			return new Pan(1, "harina");
		}
	}
}
