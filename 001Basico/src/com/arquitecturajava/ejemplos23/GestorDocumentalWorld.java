package com.arquitecturajava.ejemplos23;

import javax.sound.midi.SysexMessage;

public class GestorDocumentalWorld extends GestorDocumental{
	public void salvar(Documento documento) {
		System.out.println("salvando con word " + documento.getId());
	}
	
	public void versionar(Documento documento) {
		System.out.println("versionando con word " + documento.getId());
		Documento documentoNuevo = new Documento(documento.getId(),documento.getVersion(),documento.getContenido());
		System.out.println("version " + documento.getId());
	}
}
