package ejemplos24HerenciaRepaso;

public class Baggette extends Pan {

	public Baggette(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		System.out.println("Se cuece baggete en 10 mins");
	}

	
}
