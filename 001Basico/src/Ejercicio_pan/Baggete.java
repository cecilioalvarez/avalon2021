package Ejercicio_pan;

public class Baggete extends Pan {

	public Baggete(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void cocer() {
		System.out.println("La baggete se cuece en 10 min");
	}

}
