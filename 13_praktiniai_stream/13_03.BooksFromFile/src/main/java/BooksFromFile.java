
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file)).map(String::trim)
                    .filter(line -> !line.isEmpty())
                    .map(line -> line.split(","))
                    .map(parts -> new Book(
                            parts[0],
                            Integer.parseInt(parts[1]),
                            Integer.parseInt(parts[2]),
                            parts[3]))
                    .toList();
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

}
