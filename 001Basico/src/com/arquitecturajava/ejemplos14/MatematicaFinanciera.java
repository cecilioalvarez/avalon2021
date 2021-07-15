package com.arquitecturajava.ejemplos14;

public class MatematicaFinanciera {

	public  static final int IVASTANDARD=21;
	
	public static double importeConIVA(double importe) {
		
		return importe +(importe /100)*IVASTANDARD;
	}
}
