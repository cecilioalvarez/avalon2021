package ejercicio25;

public class Objeto25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Documento d= new Documento(1,"hola esto es texto",1);
		GestorDocumental gd=GestorFactory.getGestor("wordpress");
		gd.salvar(d);
		gd.versionar(d);
		
		GestorDocumental gd1=GestorFactory.getGestor("word");
		gd1.salvar(d);
		gd1.versionar(d);

	}

}
