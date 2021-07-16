package interfaz2;

public class Main {
	public static void main(String[] args) {
		
		Imprimible i= new Impresora();
		i.imprimir();
		
		i= new FotoCopiadoraImpresora();
		i.imprimir();
	}

}
