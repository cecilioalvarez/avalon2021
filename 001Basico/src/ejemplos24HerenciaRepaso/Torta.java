package ejemplos24HerenciaRepaso;

public class Torta extends Pan {

	public Torta(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		System.out.println("Torta se cuece en 20 mins");
	}
	

}
