package ejemplos22Interfaces;

public class ImpresoraFotocopiadora implements CopiarImprimir{

	@Override
	public void copiar() {
		System.out.println("Fotocopiadora copia.");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Fotocopiadora imprime.");
		
	}

}