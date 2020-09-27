import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Created 25.09.2020
//By Yana Gladkikh Telegram @YanaGlad12
public class Application {
    public static void main(String[] args) throws IOException {
        LibraryFactory libraryFactory = new LibraryFactory();
        //Библиотека для примера
        libraryFactory.addLibrary("C:\\Users\\glad\\Desktop\\Projects\\core — копия\\src\\main\\resources\\library.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String authorName = bufferedReader.readLine();

        libraryFactory.getLibraryById(1).printJsonSerializedClass(new Author(authorName));

    }
}
