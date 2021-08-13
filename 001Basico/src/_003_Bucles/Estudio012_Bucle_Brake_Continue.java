package _003_Bucles;

public class Estudio012_Bucle_Brake_Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i = i + 1) {

			System.out.println("estoy dentro del ciclo");

			if (i == 3) {
				break;
				// lo que hace break es parar el ciclo cuando se cumple una condicion
			}
			System.out.println("el valor de i es: " + i);
		}
		System.out.println("se ha salido del ciclo");

		System.out.println("_____________________________________");

		for (int i = 0; i < 5; i = i + 1) {

			System.out.println("estoy dentro del ciclo");

			if (i == 3) {
				continue;
				// sirve para saltar el valor pero luego continua
			}
			System.out.println("el valor de i es: " + i);
		}
		System.out.println("se ha salido del ciclo");

	}

}
