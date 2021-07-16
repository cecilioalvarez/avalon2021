package ejemplos21Interfaces;

public class Televisor implements Conectable{

	@Override
	public void encender() {
		System.out.println("Televisor se Enciende");
		
	}

	@Override
	public void apagar() {
		System.out.println("Televisor se Apaga");
		
	}

	
}
