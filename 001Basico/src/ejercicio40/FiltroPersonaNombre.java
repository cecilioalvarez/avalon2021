package ejercicio40;

public class FiltroPersonaNombre implements FiltroPersona {

	private String nombre;
	
	public FiltroPersonaNombre(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public boolean test(Persona persona) {
		return persona.getNombre().equals(nombre);
	}

}
