package Ejemplo24_Herencia;

public class Baggete extends Pan{

	public Baggete(double peso, String ingrediente) {
		super(peso, ingrediente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cocer() {
		// TODO Auto-generated method stub
		//System.out.println("la baggete se cuece en 10 m");
		
		if (getPeso()>1) {
			System.out.println("la baggete se cuece en 20 m");
			}else {
				System.out.println("la baggete se cuece en 10 m");
			}
	}

	
}
