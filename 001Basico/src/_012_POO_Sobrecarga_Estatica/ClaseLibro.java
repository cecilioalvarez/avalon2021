package _012_POO_Sobrecarga_Estatica;

public class ClaseLibro {

	public String titulo;
	public int paginasTotales;
	public int paginaActual;

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginasTotales() {
		return paginasTotales;
	}
	public void setPaginasTotales(int paginasTotales) {
		this.paginasTotales = paginasTotales;
	}
	public int getPaginaActual() {
		return paginaActual;
	}
	
	public void avanzarPagina () {
		//incremento la pagina una a una
		//paginaActual++;
		// si dejamos el parametro anterior lo que estaria haciendo el programa es sumar las paginas que he recorrido
		// con las 20 paginas en total que tiene el capitulo
		// para eso lo que hacemos es reiniciar el conteo asi:
		paginaActual++;
	}
	
	//estaremos ocultando y encapzulando la funcionalidad de avarzar por numero x de paginas
	public void avanzarPagina(int paginas) {
		//incremento de paginas pasando un valor
		paginaActual=paginaActual+paginas;
	}
	//los dos metodos anteriores tienen el mismo nombre de variable, eso es lo que se llama sobrecarga estatica
	//a pesar que tienen el mismo nombre se comportan diferente
	
	
	public void avanzarCapitulo() {
		avanzarPagina(20);
		
	}
}

