package ejercicio36;

import java.util.List;

public interface CapituloRepository {

	void insertar(Capitulo capitulo);

	void borrar(Capitulo capitulo);

	List<Capitulo> buscarTodos();

	void actualizar(Capitulo capitulo);

}