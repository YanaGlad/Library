import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;
    public Gson gson;

    public Library(String filePath) throws IOException {
        books = new ArrayList<>();

        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();

        gson = new Gson();

        while (line != null) {
            String[] str = line.split("--");
            books.add(new Book(str[1], new Author(str[0])));
            //    gson.toJson(books.get(books.size()-1));
            line = bufferedReader.readLine();
        }
    }


    public void printBooksByAuthor(Author author) {
        for (Book book : books)
            if (book.getAuthor().getName().equals(author.getName()))
                System.out.println(book.getName());
    }

    public void printJsonSerializedClass(Author author) {
        for (Book book : books)
            if (book.getAuthor().getName().equals(author.getName()))
                System.out.println(gson.toJson(book));
    }
}
