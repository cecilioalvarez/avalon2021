package ejemplos23Interfaces;

public class GestorDocumentalWord extends GestorDocumental {

	@Override
	public void salvar(Documento doc) {
		System.out.println("Documento "+doc.getId()+" salvado con word");
		
	}
	
	@Override
	public void versionar(Documento doc) {
		System.out.println("Versionando "+doc.getId()+" version:"+doc.getVersion());
		Documento docNew = new Documento(doc.getId(), doc.getVersion()+1, doc.getContenido());
		System.out.println("Version "+docNew.getVersion());
		
	}
}
