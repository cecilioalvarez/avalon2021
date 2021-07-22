package ejercicio36;

public class Capitulo {
	private String titulo;
	private int paginas;
	
	
	
	public Capitulo() {
		super();
	}
	public Capitulo(String nombre, int paginas) {
		
		this.titulo = nombre;
		this.paginas = paginas;
		
	}
	public String getNombre() {
		return titulo;
	}
	public void setNombre(String nombre) {
		this.titulo = nombre;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	

}
