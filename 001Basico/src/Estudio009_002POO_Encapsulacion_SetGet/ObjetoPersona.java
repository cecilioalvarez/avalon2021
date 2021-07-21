package Estudio009_002POO_Encapsulacion_SetGet;

public class ObjetoPersona {

	public static void main(String[] args) {
		
		// como vemos en el programa siguiente podemos asignarle cualqueir valor a la edad.
		//lo que busca el metodo set y get es limitar el acceso a datos
		ClasePersona p1=new ClasePersona();
		p1.setNombre("Alicia");
		p1.setEdad(100);
		System.out.println(p1.getEdad());
		System.out.println(p1.getNombre());

	}

}
