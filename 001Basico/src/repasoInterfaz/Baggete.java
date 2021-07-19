package repasoInterfaz;

public class Baggete extends Pan{

	public Baggete(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		// TODO Auto-generated method stub
		System.out.println("La baggete se cuece en 4 min");
	}

}
