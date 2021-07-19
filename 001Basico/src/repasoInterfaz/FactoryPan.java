package repasoInterfaz;

public class FactoryPan {

	public static Pan getPan(String tipo) {

		if (tipo.equalsIgnoreCase("baggete")) {
			return new Baggete(1, "HARINAFINA");
		} else if (tipo.equalsIgnoreCase("integral")) {
			return new Integral(2, "CENTENO");
		} else {
			return new Pan(1, "HARINANORMAL");
		}

	}
}
