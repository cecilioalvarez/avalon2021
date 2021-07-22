package ejemplos34_SQL4Patron_Repository;

import java.util.List;

public interface Capitulo_Repository {

	void addChapter(Capitulo chapter);

	void removeChapter(Capitulo chapter);

	List<Capitulo> getAllChapters();

	void modifyChapter(Capitulo chapter);

}