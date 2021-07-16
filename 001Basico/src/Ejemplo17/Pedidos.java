package Ejemplo17;

public class Pedidos {

	public static double descuentoVIP(Cliente c, double importe) {

		if (c.esVip()) {
			return importe *0.75;
		} else {
			return importe;
		}

	}
	
}
