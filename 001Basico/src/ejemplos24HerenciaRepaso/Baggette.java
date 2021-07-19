package ejemplos24HerenciaRepaso;

public class Baggette extends Pan {

	public Baggette(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		if (getPeso()>1) {
			System.out.println("Se cuece baggete en 20 mins");
		}else {
			System.out.println("Se cuece baggete en 10 mins");
		}
	}

	
}
