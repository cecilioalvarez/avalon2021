package _003_Bucles;

public class Estudio012_Bucle_Brake_Continue2_seriesNumeros {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i = i + 1) {
			
			if (i % 2== 0) {
				continue;
				// sirve para saltar el valor pero luego continua
			}
			System.out.println("el valor de i es: " + i);
		}
		System.out.println("se ha salido del ciclo");
		
		System.out.println("_____________________________");

		for (int i = 0; i < 20; i = i + 1) {
			
			if (!(i % 2== 0)) {
				continue;
				// sirve para saltar el valor pero luego continua
			}
			System.out.println("el valor de i es: " + i);
		}
		System.out.println("se ha salido del ciclo");
		
	}

}
