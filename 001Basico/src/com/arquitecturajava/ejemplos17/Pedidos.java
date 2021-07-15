package com.arquitecturajava.ejemplos17;

public class Pedidos {
	public static double descuentoVip(Cliente c, double importe) {
		if (c.esVip()) {
			return importe *0.75;
		} else {
			return importe;
		}
	}
}
