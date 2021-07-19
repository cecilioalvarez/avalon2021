package ejercicio25;

public class GestorDocumentalWord extends GestorDocumental {
	
	public void salvar(Documento documento) {
		System.out.println("salvando con word "+ documento.getId());
	}

	public void versionar(Documento documento) {
		System.out.println("versioandodo con word " +documento.getId());
		Documento documentoNuevo=new Documento(documento.getId(),documento.getContenido(),documento.getVersion());
		System.out.println("version "+ documento.getVersion());
		
	}
}
