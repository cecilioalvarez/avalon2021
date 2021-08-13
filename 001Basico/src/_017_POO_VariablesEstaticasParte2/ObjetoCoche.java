package _017_POO_VariablesEstaticasParte2;

import _017_POO_VariablesEstaticas.Coche;

public class ObjetoCoche {

	public static void main(String[] args) {
		
		Coche c1=new Coche ();
		Coche c2=new Coche ();
		Coche c3=new Coche ();
		Coche c4=new Coche ();
		Coche c5=new Coche ();
		Coche c6=new Coche("bmw", "l3");
		//que pasa, para acceder a la variable contador debo hacerlo desde 
		//la creacion de un coche, lo cual no necesariemente es correcto
		//ya que yo deberia acceder a ella incluso cuando no haya construido nada
		// asi el resultado sea cero
		//para resolver eso, lo que debemos hacer es que al constructor get de contador
		//debemos pasarlo de un metodo de instancia a un metodo de clase
		//y para eso lo que hacemos es pasarlo a static
//		System.out.println(c3.getContador());
//		System.out.println(c1.getContador());
//		System.out.println(c4.getContador());
		
		
		//accedemos al metodo contador desde la clase Coche
		System.out.println(Coche.getContador());
		

	}

}
