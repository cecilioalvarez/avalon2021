package ejemplos23InterfacesFactory;

public class GestorDocumentalWordpress extends GestorDocumental{

	@Override
	public void salvar(Documento doc) {
		System.out.println("Salvando documento en wordpress "+doc.getId());
		
	}

	@Override
	public void versionar(Documento doc) {
		System.out.println("Versionando con Wordpress "+doc.getId()+" version:"+doc.getVersion());
		Documento docNew = new Documento(doc.getId(), doc.getVersion()+1, doc.getContenido());
		System.out.println("Version "+docNew.getVersion());
		
	}

}
