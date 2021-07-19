package ejemplos23InterfacesFactory;

public abstract class GestorDocumental {

	public GestorDocumental() {
		super();
	}
	
	public abstract void salvar(Documento doc);
	public abstract void versionar(Documento doc);
	
	

}