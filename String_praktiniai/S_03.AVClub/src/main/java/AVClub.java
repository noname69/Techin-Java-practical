
import java.util.Arrays;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            Arrays.stream(line.split(" "))
                    .filter(w -> w.contains("av"))
                    .forEach(System.out::println);
        }
    }
}
