package com.arquitecturajava.ejemplos01;

public class HolaMundo16 {

	public static void main(String[] args) {
		
		double[] facturas= new double[3];
		facturas[0]=100;
		facturas[1]=200;
		facturas[2]=300;
		
		for (int i=0;i<facturas.length;i++) {
			
			System.out.println(facturas[i]*1.21);
		}
		
	}
	
	

}
