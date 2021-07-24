package Ejemplo23;

public class GestorDocumentalWord extends GestorDocumental {

	public void salvar(Documento documento) {

		System.out.println("salvando con word "+ documento.getId());

	}
public void versionar(Documento documento) {

		System.out.println("versionando con word"+ documento.getId());
		Documento documentoNuevo= new Documento(documento.getId(),documento.getContenido(),documento.getVersion()+1);
		System.out.println("version"+ documentoNuevo.getVersion());

	}
}