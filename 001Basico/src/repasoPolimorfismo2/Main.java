package repasoPolimorfismo2;

public class Main {
	public static void main(String[] args) {
		PackDonuts pack = new PackDonuts("chocolate", 2);
		System.out.println(pack.getDonut1().getSabor());
		System.out.println(pack.getDonut2().getSabor());
		System.out.println(pack.getPrecio());
		pack.setSabor("melocoton");
		System.out.println(pack.getDonut2().getSabor());
	}

}
