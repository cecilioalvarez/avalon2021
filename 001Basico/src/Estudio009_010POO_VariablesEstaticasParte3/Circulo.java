package Estudio009_010POO_VariablesEstaticasParte3;

public class Circulo {
	
	private double radio;
	//recordemos que para no tener que llamar al metodo set en el objeto, podemos utilizar un constructor
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	//metodo de instancia
	public double area() {
		return Circulo.area(this.radio);
	}
	//invocamos una clase de Java que es la de matematicas Math.***
	//pasamos el metodo de instancia a un metodo de clase, asi no tengo que crear el circulo previamente
	//metodo de clase
	public static double area(double radio) {
		return 2* Math.PI*radio;
	}

}
