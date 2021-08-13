package _003_Bucles;

public class Estudio006_Bucle_While2 {
	
	public static void main(String[] args) {
		
		int i=0;
		boolean cond=true;
		
		while (cond) {
			System.out.println("el valor de x es : " + i);
			i=i+2;
			
			if(i>8) {
				cond=false;
			}
		}
		
		//esto es lo mismo que el anterior
		int j=0;
		boolean cond1=false;
		
		while (cond1==false) {
			System.out.println("el valor de x es : " + j);
			j=j+2;
			
			if(j>8) {
				cond1=true;
			}
		}
	}

}