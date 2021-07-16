package interfaz3;

public class GestorDocumental {

	public void salvar(Documento documento) {
		System.out.println("Salvando" + documento.getId());
	}

	public void versionar(Documento documento) {
		System.out.println("versionando" + documento.getId());
		Documento documentoNuevo = new Documento(documento.getId(), documento.getVersion(),
				documento.getContenido() + 1);
		System.out.println("version" + documentoNuevo.getVersion());
	}

}
