import java.io.IOException;
import java.util.ArrayList;

public class LibraryFactory {
    private ArrayList<Library> libraries;

    public LibraryFactory() {
        libraries = new ArrayList<>();
    }

    public void addLibrary(String path) throws IOException {
        libraries.add(new Library(path));
    }

    public Library getLibraryById(int id) {
        return libraries.get(id - 1);
    }
}
