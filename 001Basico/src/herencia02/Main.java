package herencia02;

public class Main {
	public static void main(String[] args) {
		
		Libro l = new Libro("isabelallende", "bosquepigmeos", 250, 25);
		Documento doc = new Documento("gael", "100años", 350);
		Comic c = new Comic("niidea", "spiderm", 250, 20 , "ilustrator");
		LibroDigital libroDigi = new LibroDigital("autor", "titul", 12, "amazon");
		
		System.out.println(l.getTitulo());
		System.out.println(doc.getNumPag());
		System.out.println(c.getNombreIlustrador());
		System.out.println(libroDigi.getTitulo());
		
		doc.imprimir();
		l.imprimir();
		
	}

}
