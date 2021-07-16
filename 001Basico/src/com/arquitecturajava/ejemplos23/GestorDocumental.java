package com.arquitecturajava.ejemplos23;

public class GestorDocumental {

	public void salvar(Documento documento) {
		
		System.out.println("salvando"+ documento.getId());
		
	}
public void versionar(Documento documento) {
		
		System.out.println("versionando"+ documento.getId());
		Documento documentoNuevo= new Documento(documento.getId(),documento.getContenido(),documento.getVersion()+1);
		System.out.println("version"+ documentoNuevo.getVersion());
		
	}
}
