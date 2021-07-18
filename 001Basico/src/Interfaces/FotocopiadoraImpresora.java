package Interfaces;

public class FotocopiadoraImpresora implements Imprimible, Copiar {
	public void imprimir() {
		System.out.println("Imprimiendo");
	}
	public void copiar() {
		System.out.println("Copiando");
	}
}
