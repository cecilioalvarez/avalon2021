package _003_Bucles;

public class Estudio008_Bucle_Sentencias_Control_if {

	public static void main(String[] args) {
		
		int numero1=7;
		int numero2=3;
		
		// el operador o modulo % nos devuelve el residuo entre la 
		// division de dos numeros 
		System.out.println(numero1 % numero2);
		
		System.out.println("____________________________");
		
		// cuantos numeros divisibles entre 3 hay en los primeros 100
		
		int divisibles3=0;
		
		for (int i=1;i<=100;i++) {
			System.out.println(i);
			if (i%3==0) {
				divisibles3++;
			}

		}
		System.out.println("____________________");
		System.out.println(divisibles3);
	}
}
