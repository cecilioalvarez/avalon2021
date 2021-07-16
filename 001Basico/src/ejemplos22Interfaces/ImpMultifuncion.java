package ejemplos22Interfaces;

public class ImpMultifuncion implements Imprimir,Copiar,Scanner{

	@Override
	public void escanear() {
		System.out.println("Multifuncion escanea.");
		
	}

	@Override
	public void copiar() {
		System.out.println("Multifuncion copia.");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Multifuncion imprime.");
		
	}

}
