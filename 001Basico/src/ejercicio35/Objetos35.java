package ejercicio35;

public class Objetos35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DataBaseHelper helper=new DataBaseHelper("jdbc:mysql://localhost:3306/avalon","root","");
		DataBaseHelper helper=new DataBaseHelper();
		LibroAR libro=new LibroAR("26","javax","anas");
		libro.insertar();
	
		
		

	}

}
