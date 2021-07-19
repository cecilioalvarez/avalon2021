package Ejercicio_pan;

public class FactoriaPan {
	public static Pan getPan(String tipo, int peso, String ingrediente) {
		if (tipo.equals("baggete")) {
			return new Baggete(peso,ingrediente);
		} else if (tipo.equals("integral")) {
			return new PanIntegral(peso,ingrediente);
		} else {
			return new Pan(peso,ingrediente);
		}
	}
}
