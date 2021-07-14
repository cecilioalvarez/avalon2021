package ejemplo13;

public class Nota {
	
	String nombre;
	int valor;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Nota(String nombre, int valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}
	
	
}
