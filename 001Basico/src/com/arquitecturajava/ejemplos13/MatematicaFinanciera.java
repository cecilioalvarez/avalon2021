package com.arquitecturajava.ejemplos13;

public class MatematicaFinanciera {
	public static final double IVA = 21;
	
	public static double importeConIVA(double importe) {
		return importe + (importe/100)*IVA;
	}
}
