package interfaz3;

public class GestorDocumentalWordpress extends GestorDocumental{

	@Override
	public void salvar(Documento documento) {
	System.out.println("salvando el documento en wordpress"+ documento.getId());
		
	}

	@Override
	public void versionar(Documento documento) {
	
		System.out.println("versionando con wordpress"+ documento.getId());
		Documento documentoNuevo= new Documento(documento.getId(),documento.getContenido(),documento.getVersion()+1);
		System.out.println("version"+ documentoNuevo.getVersion());
	
		
	}

}