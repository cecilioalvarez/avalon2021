package interfaz3;

public abstract class GestorDocumental {

	public GestorDocumental() {
		super();
	}

	public abstract void salvar (Documento documento) ;
	public abstract void versionar (Documento documento) ;
}