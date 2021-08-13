package _004_Arrays_Matrices;

public class Estudio002_Arrays_SumaElementos {

	public static void main(String[] args) {
		
		double[] facturas=new double[3];
		facturas[0]=100;
		facturas[1]=200;
		facturas[2]=300;
		
		double total=0;
		double importetotal=0;
		for (int i=0;i<facturas.length;i++) {
			importetotal=facturas[i]*1.21;
			System.out.println(importetotal);
			total=total+importetotal;
		}
		
		System.out.println(total);
	}

}
