
import java.util.Arrays;
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            String[] words = line.split("\\s+");

            if (words.length > 0) {
                System.out.println(words[words.length - 1]);
            }
        }
    }
}
