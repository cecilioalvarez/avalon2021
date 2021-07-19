package com.arquitecturajava.ejemplos23;

public class GestorDocumentalWordpress extends GestorDocumental{

	@Override
	public void salvar(Documento documento) {
		System.out.println("salvando el documento en wordpress con " + documento.getId());
		
	}

	@Override
	public void versionar(Documento documento) {
		System.out.println("versionando con wordpress " + documento.getId());
		Documento documentoNuevo = new Documento(documento.getId(),documento.getVersion(),documento.getContenido());
		System.out.println("version " + documento.getVersion());
		
	}
	
}
