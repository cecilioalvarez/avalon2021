package ejercicio25;

public class GestorDocumentalWordpress extends GestorDocumental{

	@Override
	public void salvar(Documento documento) {
		// TODO Auto-generated method stub
		System.out.println("salvando el documento en wordpress "+  documento.getId());
		
	}

	@Override
	public void versionar(Documento documento) {
		// TODO Auto-generated method stub
		System.out.println("versionando con wordpress" +documento.getId());
		Documento documentoNuevo=new Documento(documento.getId(),documento.getContenido(),documento.getVersion());
		System.out.println("version "+ documento.getVersion());
		
	}

}
