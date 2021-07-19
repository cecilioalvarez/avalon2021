package ejemplos24HerenciaRepaso;

public class PanIntegral extends Pan {

	public PanIntegral(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		System.out.println("Se cuece Pan integral en 1 h");
	}

	
}
