package interfaz;

public class Televisor implements Conectable{

	@Override
	public void encender() {
		System.out.println("El televisor se enciende");
		
	}

	@Override
	public void apagar() {
		System.out.println("El televisor se apaga");
		
	}

}
