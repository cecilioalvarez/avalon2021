package Ejemplo22;

public class Objeto22 {
public static void main(String[] args) {

	Imprimible i= new Impresora();
	i.imprimir();

	i= new FotoCopiadoraImpresora();
	i.imprimir();

	CopiableImprimible c = new FotoCopiadoraImpresora();
	c.copiar();
	c.imprimir();
}
}