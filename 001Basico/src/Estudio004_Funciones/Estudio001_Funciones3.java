package Estudio004_Funciones;

public class Estudio001_Funciones3 {

	public static void main(String[] args) {
		
		
		mensaje("holas", 8);
		mensaje("como estas", 3);
		
	}	
	
	private static void mensaje(String mensaje, int repeticiones) {

		for (int i = 0; i < repeticiones; i++) {
			System.out.println(mensaje);
		}
	}

}
