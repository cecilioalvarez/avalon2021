package Estudio004_Funciones;

public class Estudio004_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1=5;
		int numero2=6;
		int numero3=5;
		int numero4=6;
		
		//de esta forma ganamos en flexibilidad ya que aca imprimimos el valor por la consola
		int resultado=suma(numero1,numero2)+suma(numero3,numero4);
		System.out.println(resultado);
		
	}
	//el void se remplaza por int y el print por return
	//en esta forma obtenemos el valor de la funcion directamente 
	//para que ese nuevo valor podamos asignarle un variable y utilizarlo en otro lado
	// con el void siempre estamos obligados a sacar el valor por pantalla
	static int suma (int a,int b) {
		return a+b;
	}
}
