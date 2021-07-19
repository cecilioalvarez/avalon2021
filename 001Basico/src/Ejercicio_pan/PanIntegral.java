package Ejercicio_pan;

public class PanIntegral extends Pan {
	@Override
	public void cocer() {
		System.out.println("El pan se cuece en una hora");
	}

	public PanIntegral(int peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}
}
