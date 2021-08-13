package _017_POO_VariablesEstaticasParte3;

public class ObjetoCirculo {

	public static void main(String[] args) {
		
		//podemos crear el circulo sin tener que construir el objeto circulo
		System.out.println(Circulo.area(3));
	
		//y tambien podemos crear el circulo
		//lo anterior obliga a colocar el area tanto en la creacion del circulo como de el carculo del area
		//para mejorar esto utilizamos un metodo que llame al metodo statico
		Circulo c=new Circulo(4);
		System.out.println(c.area());

	}

}
