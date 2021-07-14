package ejemplo13;

public class Persona {
	
	private String nombre;
	private int edad;
	private ArrayList<Nota> notas= new ArrayList<Nota>();
	
	
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad, ArrayList<Nota> notas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notas = notas;
	}
	
	
	}

}
