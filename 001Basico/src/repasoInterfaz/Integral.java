package repasoInterfaz;

public class Integral extends Pan {

	public Integral(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		System.out.println("El pan integral se cuece en 15 min");
	}

}
