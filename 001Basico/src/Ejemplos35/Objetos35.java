package Ejemplos35;

public class Objetos35 {
	public static void main(String[] args) {

		//DataBaseHelper helper=new DataBaseHelper("jdbc:mysql://localhost:3306/avalon","root","");
		DataBaseHelper helper=new DataBaseHelper();
		Libro libro = new Libro("28","c++","alberto",helper);
		libro.insertar();
	}

}
