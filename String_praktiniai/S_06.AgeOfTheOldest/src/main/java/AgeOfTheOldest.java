

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String[]> people = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break;

            String[] parts = line.split(",");
            String name = parts[0].trim();
            String age = parts[1].trim();

            people.add(new String[]{name, age});
        }

        people.stream()
                .max(Comparator.comparingInt(p -> Integer.parseInt(p[1])))
                .ifPresent(p -> System.out.println("Name of the oldest: " + p[1]));

    }
}
