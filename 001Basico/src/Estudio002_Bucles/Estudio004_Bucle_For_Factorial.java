package Estudio002_Bucles;

public class Estudio004_Bucle_For_Factorial {

	public static void main(String[] args) {
		
		// factorial de 5 es = 5*4*3*2*1=120
		int factorial=1;
		for (int i=1;i<=5;i++) {
			factorial=factorial*i;
			System.out.println(factorial);
		}
		
		System.out.println("factorial final es :"+factorial);
		
	}

}
