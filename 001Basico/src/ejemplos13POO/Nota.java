package ejemplos13POO;

public class Nota {

	private String asignatura;
	private int valor;
	
	public Nota(String asignatura, int valor) {
		super();
		this.asignatura = asignatura;
		this.valor = valor;
	}
	
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
