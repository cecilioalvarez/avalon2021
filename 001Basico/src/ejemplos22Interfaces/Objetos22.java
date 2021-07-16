package ejemplos22Interfaces;

public class Objetos22 {

	public static void main(String[] args) {
		Impresora imp = new Impresora();
		ImpresoraFotocopiadora imFoto = new ImpresoraFotocopiadora();
		ImpMultifuncion multi = new ImpMultifuncion();
		imp.imprimir();
		imFoto.imprimir();
		multi.imprimir();
		imFoto.copiar();
		multi.copiar();
		multi.escanear();

	}

}
