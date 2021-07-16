package interfaz2;

public class FotoCopiadoraImpresora implements Imprimible,Copiable{

	@Override
	public void copiar() {
		System.out.println("la fotocopiadora copia");
		
	}

	@Override
	public void imprimir() {
	
		System.out.println("la fotocopiadora imprime");
		
	}

}