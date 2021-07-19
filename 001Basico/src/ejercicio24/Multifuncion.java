package ejercicio24;

public class Multifuncion implements Imprimir, Copiar, Scanner{

	@Override
	public void scanner() {
		// TODO Auto-generated method stub
		System.out.println("la multifuncion scanea");
		
	}

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("la multifuncion copia");
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("la multifuncion imprime");
	}

}
