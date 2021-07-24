package Ejemplo35_SQL;

public class Objeto35 {

	public static void main(String[] args) {
		
		DataBaseHelper helper= new DataBaseHelper("jdbc:mysql://localhost:3306/avalon", "root", "");
		//insertar registros a la tabla Libro
		LibroAR libroAR1 = new LibroAR("28","java","pedro",helper);
		LibroAR libroAR2 = new LibroAR("29","scala","toto",helper);
		LibroAR libroAR3 = new LibroAR("30","linux","juan",helper);
		libroAR1.insertar();
		libroAR2.insertar();
		libroAR3.insertar();

	}

}
