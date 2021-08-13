package _022_Herencia_Polimorfismo;

public class Carro {
	
	double peso;
	double altura;
	double ancho;
	double largo;
	int numeroPuertas;
	boolean encendido=false;
	String modelo;
	
	public Carro() {
		this.peso=500;
		this.altura=170;
		this.ancho=120;
		this.largo=305;
	}

	//como vemos este metodo lo comparten las tres clases
	//el polimorfismo es que podemos llamar a un metodo en diferentes clases con el msimo nombre
	//este traera el resultado de acuerdo a la delcaracion del objeto
	public void informacion () {
		this.encendido=false;
		System.out.println("el carro se apagara");
	}
	
	public String modelo() {
		return this.modelo;
	}
	
	public double obtenerPeso () {
		return this.peso;
	}
	
	public void encender () {
		this.encendido=true;
		System.out.println("el carro se encendera");
	}
	
	public void apagar () {
		this.encendido=false;
		System.out.println("el carro se apagara");
	}
	
	public void estado () {
		if(this.encendido=true) {
			System.out.println("el carro esta encendido");
		}else {
			System.out.println("el carro esta apagado");
		}
	}
}
