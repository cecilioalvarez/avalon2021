package Estudio004_Funciones;

public class Estudio002_FuncionesSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1=5;
		int numero2=6;
		int numero3=20;
		int numero4=10;
		
		//es importante aclarar que al asignar variables estas no necesariamente 
		//deben ser llamadas igual que los parametros de la funcion
		
		suma(numero1,numero2);
		suma(numero2,numero1);
		suma(numero3,numero4);
		suma(numero4,numero3);
		
	}
	
	//en este caso en los parametros () asigno dos variables int a y int b
	static void suma (int a,int b) {
		System.out.println(a+b);
		System.out.println("lo anterior lo saque de un funcion");
	}
}
