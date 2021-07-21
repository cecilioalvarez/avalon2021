package sql2;

public class SQL9Objetos {
	public static void main(String[] args) {
		
		DataBaseHelper helper = new DataBaseHelper("jdbc:mysql://localhost:3306/avalon", "root", "metrica123");
		Libro libroAr = new Libro("27", "JAvasito", "ana", helper);
		
		libroAr.insertar();
	}

}
