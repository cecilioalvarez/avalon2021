package Ejemplo20;

public class Objeto20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackDonuts pack= new PackDonuts("chocolate", 2);
		System.out.println(pack.getDonut1().getSabor());
		System.out.println(pack.getDonut2().getSabor());
		System.out.println(pack.getPrecio());
		
		pack.setSabor("fresa");
		System.out.println(pack.getDonut1().getSabor());
		System.out.println(pack.getDonut2().getSabor());
		System.out.println(pack.getSabor());


	}

}
