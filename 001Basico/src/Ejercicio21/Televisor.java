package Ejercicio21;

public class Televisor implements Conectable {
	
	@Override
	public void encenderBombilla() {
		System.out.println("El televisor se enciende");
	}
	@Override
	public void apagarBombilla() {
		System.out.println("El televisor se apaga");
	}
}