
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static List<String> read(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .toList();
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        List<String> lines = read(filename);
        lines.forEach(System.out::println);

    }

}
