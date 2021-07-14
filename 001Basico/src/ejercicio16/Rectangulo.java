package ejercicio16;

public class Rectangulo {
	
	private int lado;
	private int lado2;
	
	
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	//Staticos e implemetados como estaticos: aqui modularizamos
	public static double getArea(int lado, int lado2) {
		return lado*lado2;
	}
	
	public static double getPerimetro(int lado, int lado2) {
		return lado*2 + lado2*2;
	}
	
	//funcionles a nivel de instancia que delegan en los metodos statics, aqui añadimos flexibilidad sin aumetar la complejidad
	public  double getArea() {
		//aqui delego en el metodo estatico
		return getArea(this.getLado(), this.getLado2());
	}
	
	public  double getPerimetro() {
		return getPerimetro(this.getLado()*2, this.getLado2()*2);
	}
	
	//Sistema modulares a piezas: la modularizacion permite la reutilizacion de las piezas
	
	

}
