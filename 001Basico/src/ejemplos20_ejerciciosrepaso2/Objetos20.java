package ejemplos20_ejerciciosrepaso2;

public class Objetos20 {

	public static void main(String[] args) {

		Pack packDonuts = new Pack("choco", 2);

		System.out.println(packDonuts.getDonut1().getSabor());
		System.out.println(packDonuts.getDonut2().getSabor());
		System.out.println(packDonuts.getPrecio());
		packDonuts.setSabor("fresa");
		System.out.println(packDonuts.getSabor());
	}

}
