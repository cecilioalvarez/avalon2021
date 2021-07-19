package ejercicio24;

public class FotocopiadoraImpresora implements Imprimir, Copiar{

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("la fotocopiadora copia");
		
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("la fotocopiadora imprime");
	}

}
