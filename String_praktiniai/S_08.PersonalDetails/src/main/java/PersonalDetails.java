
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String[]> people = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            String[] parts = line.split(",");
            String name = parts[0].trim();
            String year = parts[1].trim();

            people.add(new String[]{name, year});
        }

        String longestName = people.stream()
                .map(p -> p[0])
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                .orElse("");

        double average = people.stream()
                .mapToInt(p -> Integer.parseInt(p[1]))
                .average()
                .orElse(0);

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);

    }
}
